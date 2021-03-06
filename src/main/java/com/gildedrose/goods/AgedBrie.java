package com.gildedrose.goods;

import com.gildedrose.Goods;

public class AgedBrie extends Goods {

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality < 50) {
            increaseQuality();
        }
    }

    @Override
    public void updateSellInWhenExpired() {
        if (this.quality < 50) {
            increaseQuality();
        }
    }

    private void increaseQuality() {
        this.quality = this.quality + 1;
    }
}
