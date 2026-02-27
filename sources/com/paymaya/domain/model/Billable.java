package com.paymaya.domain.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public interface Billable extends Parcelable {
    String getAccountNumber();

    Amount getAmount();

    String getBillerSlug();
}
