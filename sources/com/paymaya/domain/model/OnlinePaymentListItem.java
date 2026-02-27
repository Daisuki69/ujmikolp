package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public interface OnlinePaymentListItem {

    public static class OnlinePaymentLoading implements OnlinePaymentListItem {
        @Override // com.paymaya.domain.model.OnlinePaymentListItem
        public VIEW_TYPE getViewType() {
            return VIEW_TYPE.VIEW_TYPE_LOADING;
        }
    }

    public enum VIEW_TYPE {
        VIEW_TYPE_ITEM(0),
        VIEW_TYPE_LOADING(1);

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
