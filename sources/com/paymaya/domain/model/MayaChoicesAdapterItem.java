package com.paymaya.domain.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public interface MayaChoicesAdapterItem extends Parcelable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_ITEM = 1;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int VIEW_TYPE_HEADER = 0;
        public static final int VIEW_TYPE_ITEM = 1;

        private Companion() {
        }
    }

    String getItemAsString();

    int getViewType();
}
