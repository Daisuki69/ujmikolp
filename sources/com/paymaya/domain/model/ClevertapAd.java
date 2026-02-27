package com.paymaya.domain.model;

import android.graphics.Bitmap;
import com.paymaya.domain.model.CarouselItem;

/* JADX INFO: loaded from: classes4.dex */
public class ClevertapAd extends CarouselItem {
    private final String mAction;
    private String mBannerKey;
    private Bitmap mBitmap;
    private final String mMediaLink;
    private final String mMessage;
    private String mName;
    private int mPriority;
    private final String mTitle;
    private final String mUnitId;

    public enum TextStyle {
        FULL_SIZE_BANNER,
        DEFAULT,
        V4_WITH_TEXT_BANNER
    }

    public ClevertapAd(int i, String str, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8) {
        super(str);
        this.mMediaLink = str3;
        this.mUnitId = str2;
        this.mAction = str4;
        this.mTitle = str5;
        this.mMessage = str6;
        initializeCarouselPosition(i);
        this.mPriority = i4;
        this.mName = str7;
        this.mBannerKey = str8;
    }

    private void initializeCarouselPosition(int i) {
        setCarouselPosition(i);
    }

    public String getAction() {
        return this.mAction;
    }

    public String getBannerKey() {
        return this.mBannerKey;
    }

    public int getBannerPriority() {
        return this.mPriority;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public String getMediaLink() {
        return this.mMediaLink;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public String getName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.CarouselItem
    public CarouselItem.CAROUSEL_PRIORITY getPriority() {
        return CarouselItem.CAROUSEL_PRIORITY.CLEVERTAP;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUnitId() {
        return this.mUnitId;
    }

    @Override // com.paymaya.domain.model.CarouselItem
    public CarouselItem.VIEW_TYPE getViewType() {
        return CarouselItem.VIEW_TYPE.VIEW_TYPE_CLEVERTAP_AD;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }
}
