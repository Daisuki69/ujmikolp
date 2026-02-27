package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public interface FavoriteListItem {

    public enum VIEW_TYPE {
        VIEW_TYPE_LABEL(0),
        VIEW_TYPE_ITEM(1);

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
