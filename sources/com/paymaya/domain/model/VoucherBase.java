package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_VoucherBase;
import com.paymaya.domain.model.C$AutoValue_VoucherBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VoucherBase implements Parcelable {

    public static abstract class Builder {
        public abstract VoucherBase build();

        public abstract Builder mData(List<Voucher> list);

        public abstract Builder mMeta(Meta meta);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_VoucherBase.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_VoucherBase.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("data")
    public abstract List<Voucher> mData();

    @InterfaceC1498b("meta")
    public abstract Meta mMeta();
}
