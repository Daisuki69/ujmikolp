package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public interface VoucherListItem {

    public enum VIEW_TYPE {
        VIEW_TYPE_AVAILABLE_VOUCHER(0),
        VIEW_TYPE_CLAIMED_VOUCHER(1),
        VIEW_TYPE_EXPIRED_VOUCHER(2),
        VIEW_TYPE_LOADING(3);

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
