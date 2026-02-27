package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public interface LoadUpPartnerItem {

    public enum VIEW_TYPE {
        VIEW_TYPE_HEADER(0),
        VIEW_TYPE_ITEM(1),
        VIEW_TYPE_METHOD(2),
        VIEW_TYPE_ACCOUNT_LIMIT(3),
        VIEW_TYPE_BANNER(4);

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
