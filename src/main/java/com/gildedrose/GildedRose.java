package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Goods[] goods;

    public GildedRose(Goods[] goods) {
        this.goods = goods;
    }

    public void updateGoodsEveryDay() {
        Arrays.stream(goods).forEach(Goods::updateInfoEveryDay);
    }
}
