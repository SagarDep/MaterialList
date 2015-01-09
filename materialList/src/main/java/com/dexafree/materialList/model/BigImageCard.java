package com.dexafree.materialList.model;

import android.content.Context;
import android.graphics.Color;

import com.dexafree.materialList.R;

public class BigImageCard extends Card {
	public BigImageCard(final Context context) {
		super(context);
	}

	@Override
    public int getLayout() {
        return R.layout.material_big_image_card_layout;
    }
}
