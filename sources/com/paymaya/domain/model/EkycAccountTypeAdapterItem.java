package com.paymaya.domain.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public interface EkycAccountTypeAdapterItem extends Parcelable {

    public enum VIEW_TYPE {
        VIEW_TYPE_HEADER(0),
        VIEW_TYPE_ACCOUNT_TYPE(1);

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
