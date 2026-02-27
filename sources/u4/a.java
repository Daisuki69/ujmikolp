package U4;

import Bj.E;
import bj.AbstractC1039j;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5938a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5938a = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a(this.f5938a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f5938a).openConnection());
            Callback.openConnection(uRLConnection);
            j.e(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            httpsURLConnection.setConnectTimeout(3000);
            Callback.connect((HttpURLConnection) httpsURLConnection);
            Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
            j.f(serverCertificates, "getServerCertificates(...)");
            ArrayList arrayList = new ArrayList(serverCertificates.length);
            for (Certificate certificate : serverCertificates) {
                byte[] encoded = certificate.getEncoded();
                j.f(encoded, "getEncoded(...)");
                arrayList.add(encoded);
            }
            httpsURLConnection.disconnect();
            return new ArrayList(arrayList);
        } catch (Exception unused) {
            return null;
        }
    }
}
