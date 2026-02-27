package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public interface ShopListItem {

    public enum VIEW_TYPE {
        VIEW_TYPE_PRODUCT(0),
        VIEW_TYPE_HEADER(1),
        VIEW_TYPE_LOADING(2);

        private final int value;

        VIEW_TYPE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    VIEW_TYPE getViewType();
}
