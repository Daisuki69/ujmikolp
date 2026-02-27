package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements InterfaceC1101b {
    @Override // aj.InterfaceC0716a
    public final Object get() {
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(com.paymaya.common.utility.A.f10366a));
        Nh.j jVar = Th.e.c;
        if (jVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        Retrofit.Builder builderAddCallAdapterFactory = builderAddConverterFactory.addCallAdapterFactory(new mg.e(jVar));
        AbstractC1955a.d(builderAddCallAdapterFactory);
        return builderAddCallAdapterFactory;
    }
}
