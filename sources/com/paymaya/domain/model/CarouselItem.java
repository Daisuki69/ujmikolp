package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CarouselItem {
    private int mCarouselPosition;
    private String mPropertyId;

    public enum CAROUSEL_PRIORITY {
        CLEVERTAP(0);

        private final int value;

        CAROUSEL_PRIORITY(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VIEW_TYPE {
        VIEW_TYPE_LOAN(0),
        VIEW_TYPE_CLEVERTAP_AD(1),
        VIEW_TYPE_BANNER(2);

        private final int value;

        VIEW_TYPE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public CarouselItem(String str) {
        this.mPropertyId = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.mPropertyId.equals(((CarouselItem) obj).mPropertyId);
        }
        return false;
    }

    public int getCarouselPosition() {
        return this.mCarouselPosition;
    }

    public abstract CAROUSEL_PRIORITY getPriority();

    public String getPropertyId() {
        return this.mPropertyId;
    }

    public abstract VIEW_TYPE getViewType();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mCarouselPosition), this.mPropertyId});
    }

    public void setCarouselPosition(int i) {
        this.mCarouselPosition = i;
    }

    public void setPropertyId(String str) {
        this.mPropertyId = str;
    }
}
