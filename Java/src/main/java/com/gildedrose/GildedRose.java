package com.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
				//first  i handled the update for the 3 exception product
			
			//strat by aged brie
			if (items[i].name.equals("Aged Brie")) {
				if (items[i].quality > 50) {
					items[i].sellIn -= 1;
				} else {
					items[i].quality += 1;
					items[i].sellIn -= 1;
				}
			} 
			// for the sulfuras
			else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
				items[i].sellIn = items[i].sellIn;
				items[i].quality = items[i].quality;
			} 
			// for the backstage
			else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {

				if (items[i].quality < 50) {
					items[i].quality = items[i].quality + 1;

					if (items[i].sellIn < 11) {
						if (items[i].quality < 50) {
							items[i].quality = items[i].quality + 1;
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}
					}
				}
				items[i].sellIn -= 1;

			}
			// for all other products
			else {
				if (items[i].quality == 0) {
					items[i].sellIn -= 1;
				} else {
					items[i].quality -= 1;
					items[i].sellIn -= 1;
				}
			}
		}
	}
}