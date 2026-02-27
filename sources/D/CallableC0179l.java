package D;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.paymaya.domain.model.KycCmsContent;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: D.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0179l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f928b;

    public /* synthetic */ CallableC0179l(Context context, int i) {
        this.f927a = i;
        this.f928b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f927a) {
            case 0:
                String strTnTj78 = numX49.tnTj78("PeBH");
                Context context = this.f928b;
                kotlin.jvm.internal.j.g(context, strTnTj78);
                C0181n.c = b0.e(context).getBoolean(numX49.tnTj78("PeBO"), true);
                return null;
            default:
                InputStream inputStreamOpen = this.f928b.getAssets().open("simple-capture-v8.json");
                kotlin.jvm.internal.j.f(inputStreamOpen, numX49.tnTj78("PeBF"));
                return (KycCmsContent) new com.google.gson.j().d(new InputStreamReader(inputStreamOpen), TypeToken.get(KycCmsContent.class));
        }
    }
}
