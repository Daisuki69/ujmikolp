package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public interface LoanItem {

    public enum VIEW_TYPE {
        VIEW_TYPE_WHITELISTED_LOAN(0),
        VIEW_TYPE_LOAN_INSTANCE(1),
        VIEW_TYPE_LOAN_HEADER(2);

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
