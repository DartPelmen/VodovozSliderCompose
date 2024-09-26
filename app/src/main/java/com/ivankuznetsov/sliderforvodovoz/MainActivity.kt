package com.ivankuznetsov.sliderforvodovoz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ivankuznetsov.sliderforvodovoz.data.viewmodel.SliderViewModel
import com.ivankuznetsov.sliderforvodovoz.network.model.Good
import com.ivankuznetsov.sliderforvodovoz.network.model.TopGoods
import com.ivankuznetsov.sliderforvodovoz.ui.theme.SliderForVodovozTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SliderForVodovozTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        TopGoodsWidget(modifier = Modifier)
                    }
                }
            }
        }
    }
}

@Composable
fun TopGoodsWidget(
    modifier: Modifier = Modifier,
    sliderViewModel: SliderViewModel = koinViewModel()
) {
    val sliderData by sliderViewModel.getSliderData().collectAsState(
        initial = TopGoods(
            status = "",
            message = "",
            mutableListOf()
        )
    )
    Slider(modifier, sliderData)
}

@Composable
fun Slider(modifier: Modifier = Modifier, sliderData: TopGoods) {
    if (sliderData.status == "") {
        Text("")
    } else if (sliderData.status != "Success") {
        Text("ошибка получения данных")
    } else {

        var selectedCategory by rememberSaveable() {

            mutableIntStateOf(0)
        }
        SliderWidget(
            selectedCategory = selectedCategory,
            onSelectCategory = { index -> selectedCategory = index },
            sliderData = sliderData
        )
    }
}

@Composable
fun SliderWidget(
    modifier: Modifier = Modifier,
    selectedCategory: Int,
    onSelectCategory: (Int) -> Unit,
    sliderData: TopGoods
) {
    Column {
        LazyRow {
            items(sliderData.categories) {
                TextButton(onClick = { onSelectCategory(sliderData.categories.indexOf(it)) }) {
                    Text(
                        modifier = Modifier,
                        color = if (it == sliderData.categories[selectedCategory]) colorResource(
                            id = R.color.blue_text
                        ) else colorResource(id = R.color.gray_text), text = it.nAME
                    )
                }
            }
        }
        sliderData.categories[selectedCategory].data?.let { data ->
            LazyRow {
                items(data) {
                    SliderCard(good = it)
                }
            }
        }
    }
}

@Composable
fun SliderCard(modifier: Modifier = Modifier, good: Good) {
    Box(
        contentAlignment = Alignment.Center, modifier = Modifier
            .width(128.dp)
            .height(128.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .height(100.dp)
                .width(100.dp), model = "https://szorin.vodovoz.ru" + good.detailPicture,
            contentDescription = "good pic"
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .width(128.dp)
                .height(128.dp), verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                IconButton(modifier = Modifier, onClick = { /*TODO*/ }) {

                    Icon(
                        Icons.Outlined.FavoriteBorder,
                        modifier = Modifier,
                        contentDescription = null
                    )

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row {
                    Text(good.eXTENDED_PRICE.first().price.toString(), fontWeight = FontWeight.Bold)
                    Text(" ₽")
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Outlined.ShoppingCart,
                        modifier = Modifier
                            .clip(RoundedCornerShape(percent = 50))
                            .background(colorResource(id = R.color.basket_icon_background)),
                        contentDescription = "add to fav"
                    )
                }

            }
        }
    }
}

