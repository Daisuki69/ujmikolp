package com.tencent.could.component.common.ai.net;

import Y.e;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.google.firebase.messaging.r;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.ai.net.TxNetWorkHelper;
import com.tencent.could.component.common.ai.utils.GZipUtils;
import df.C1356B;
import df.C1362d;
import df.C1363e;
import df.C1364f;
import df.C1365g;
import df.C1366h;
import df.InterfaceC1359a;
import df.InterfaceC1360b;
import df.InterfaceC1361c;
import df.i;
import df.k;
import df.y;
import ef.c;
import hf.C1564b;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jk.b;
import k2.v0;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpRequest extends JsonHttpRequest {
    public static volatile int currentConnectTimeout = 15000;
    public static volatile int currentTimeout = 30000;

    public class TimeoutInterceptor implements InterfaceC1361c {
        public TimeoutInterceptor() {
        }

        @Override // df.InterfaceC1361c
        public k intercept(InterfaceC1360b interfaceC1360b) {
            C1564b c1564b = (C1564b) interfaceC1360b;
            C1365g c1365g = c1564b.e;
            Log.e("OkHttpRequest", "TimeoutInterceptor intercept");
            if (OkHttpRequest.this.f15581b == null) {
                TxNetWorkHelper.AnonymousClass1 anonymousClass1 = (TxNetWorkHelper.AnonymousClass1) b.f17824a.c;
                if (AbstractC2217b.a(2, v0.f18022d) >= 0) {
                    v0.f("netWorkParam is null!", anonymousClass1);
                }
                return c1564b.a(c1365g);
            }
            Log.e("OkHttpRequest", "currentConnectTimeout:" + OkHttpRequest.currentConnectTimeout);
            Log.e("OkHttpRequest", "currentTimeout:" + OkHttpRequest.currentTimeout);
            int i = OkHttpRequest.currentConnectTimeout;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int iC = c.c(i);
            ArrayList arrayList = c1564b.f17033a;
            gf.k kVar = c1564b.f17034b;
            r rVar = c1564b.c;
            int i4 = c1564b.f17035d;
            C1365g c1365g2 = c1564b.e;
            C1356B c1356b = c1564b.f;
            int iC2 = c.c(OkHttpRequest.currentTimeout);
            int iC3 = c.c(OkHttpRequest.currentTimeout);
            C1564b c1564b2 = new C1564b(arrayList, kVar, rVar, i4, c1365g2, c1356b, iC, iC3, iC2);
            TxNetWorkHelper.getInstance().logDebug("OkHttpRequest", "ConnectTimeout:" + iC);
            TxNetWorkHelper.getInstance().logDebug("OkHttpRequest", "WriteTimeout:" + iC2);
            TxNetWorkHelper.getInstance().logDebug("OkHttpRequest", "ReadTimeout:" + iC3);
            return c1564b2.a(c1365g);
        }
    }

    public final C1365g a(String str, i iVar) {
        String str2;
        Ci.b bVar = new Ci.b();
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        y yVar = new y();
        yVar.b(null, str2);
        bVar.f785b = yVar.a();
        HashMap<String, String> requestHeaders = this.f15581b.getRequestHeaders();
        if (requestHeaders != null) {
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                bVar.e(entry.getKey(), entry.getValue());
            }
        }
        if (this.f15581b.isGzip()) {
            bVar.e(RtspHeaders.CONTENT_ENCODING, "gzip");
            bVar.e("Accept-Encoding", "gzip");
        }
        if (iVar != null) {
            bVar.F(ShareTarget.METHOD_POST, iVar);
        }
        return bVar.k();
    }

    @Override // com.tencent.could.component.common.ai.net.JsonHttpRequest, com.tencent.could.component.common.ai.net.IHttpRequest
    public void execute() throws Throwable {
        C1362d c1362dA;
        String str;
        C1366h c1366h;
        C1365g c1365gA;
        C1364f c1364f;
        Log.e("OkHttpRequest", "OkHttpRequest execute!");
        NetWorkParam netWorkParam = this.f15581b;
        if (netWorkParam == null) {
            TxNetWorkHelper.getInstance().logError("OkHttpRequest", "netWorkParam is null!");
            return;
        }
        String url = netWorkParam.getUrl();
        if (this.c && !TextUtils.isEmpty(this.f15581b.getDeputyUrl())) {
            TxNetWorkHelper.getInstance().logError("OkHttpRequest", "use DeputyUrl");
            url = this.f15581b.getDeputyUrl();
        }
        C1362d c1362dA2 = null;
        if (HttpMethod.GET == this.f15581b.getHttpMethod()) {
            c1365gA = a(url, (i) null);
        } else {
            if (this.f15581b.isGzip()) {
                try {
                    c1362dA2 = C1362d.a("application/json");
                } catch (IllegalArgumentException unused) {
                }
                byte[] bArrCompress = GZipUtils.compress(this.f15581b.getRequestData());
                int length = bArrCompress.length;
                long length2 = bArrCompress.length;
                long j = 0;
                long j6 = length;
                byte[] bArr = c.f16663a;
                if ((j | j6) < 0 || j > length2 || length2 - j < j6) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                c1366h = new C1366h(c1362dA2, length, bArrCompress);
            } else {
                try {
                    c1362dA = C1362d.a("application/json");
                } catch (IllegalArgumentException unused2) {
                    c1362dA = null;
                }
                String requestData = this.f15581b.getRequestData();
                Charset charset = StandardCharsets.UTF_8;
                if (c1362dA != null) {
                    try {
                        str = c1362dA.f16404b;
                    } catch (IllegalArgumentException unused3) {
                    }
                    Charset charsetForName = str != null ? Charset.forName(str) : null;
                    if (charsetForName == null) {
                        try {
                            c1362dA2 = C1362d.a(c1362dA + "; charset=utf-8");
                        } catch (IllegalArgumentException unused4) {
                        }
                        c1362dA = c1362dA2;
                    } else {
                        charset = charsetForName;
                    }
                }
                byte[] bytes = requestData.getBytes(charset);
                int length3 = bytes.length;
                long length4 = bytes.length;
                long j7 = 0;
                long j9 = length3;
                byte[] bArr2 = c.f16663a;
                if ((j7 | j9) < 0 || j7 > length4 || length4 - j7 < j9) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                c1366h = new C1366h(c1362dA, length3, bytes);
            }
            c1365gA = a(url, c1366h);
        }
        currentConnectTimeout = this.f15581b.getConnectTimeOut();
        currentTimeout = this.f15581b.getTimeOutTimes();
        e eVar = b.f17824a;
        C1364f c1364f2 = (C1364f) eVar.f6708b;
        if (c1364f2 == null) {
            Log.e("OkHttpRequest", "OkHttpRequest execute! client == null");
            Log.e("OkHttpRequest", "createOkHttpClient");
            C1363e c1363e = new C1363e();
            long connectTimeOut = this.f15581b.getConnectTimeOut();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1363e.f16417t = c.c(connectTimeOut);
            c1363e.f16416s = c.c(this.f15581b.getTimeOutTimes());
            c1363e.f16418u = c.c(this.f15581b.getTimeOutTimes());
            c1363e.f16419v = c.c(this.f15581b.getTimeOutTimes());
            c1363e.f16407d.add(new TimeoutInterceptor());
            final String[] connectIps = this.f15581b.getConnectIps();
            if (connectIps == null || connectIps.length == 0) {
                c1364f = new C1364f(c1363e);
            } else {
                c1363e.f16412o = new InterfaceC1359a(this) { // from class: com.tencent.could.component.common.ai.net.OkHttpRequest.1
                    @Override // df.InterfaceC1359a
                    public List<InetAddress> lookup(String str2) throws UnknownHostException {
                        ArrayList arrayList = new ArrayList(connectIps.length);
                        for (String str3 : connectIps) {
                            try {
                                arrayList.add(InetAddress.getByName(str3));
                            } catch (UnknownHostException e) {
                                TxNetWorkHelper.getInstance().logError("OkHttpRequest", "UnknownHostException " + e.getLocalizedMessage());
                            }
                        }
                        if (arrayList.size() != 0) {
                            return arrayList;
                        }
                        if (str2 == null) {
                            throw new UnknownHostException("hostname == null");
                        }
                        try {
                            return Arrays.asList(InetAddress.getAllByName(str2));
                        } catch (NullPointerException e7) {
                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str2));
                            unknownHostException.initCause(e7);
                            throw unknownHostException;
                        }
                    }
                };
                c1364f = new C1364f(c1363e);
            }
            c1364f2 = c1364f;
            eVar.f6708b = c1364f2;
        }
        C1356B c1356b = new C1356B(c1364f2, c1365gA);
        c1356b.f16393b = new gf.k(c1364f2, c1356b);
        try {
            k kVarB = c1356b.b();
            int i = kVarB.c;
            if (i != 200) {
                throw new RuntimeException("responseCode error: " + i);
            }
            if (kVarB.f16453g == null) {
                throw new RuntimeException("response.body is null!");
            }
            if (this.f15580a == null) {
                TxNetWorkHelper.getInstance().logError("OkHttpRequest", "callBackListener is null!");
            } else if ("gzip".equals(kVarB.b(RtspHeaders.CONTENT_ENCODING))) {
                this.f15580a.onSuccess(GZipUtils.uncompressToString(kVarB.f16453g.b()));
            } else {
                this.f15580a.onSuccess(kVarB.f16453g.i());
            }
            kVarB.close();
        } catch (IOException e) {
            throw new RuntimeException("realExecute error: " + e.getLocalizedMessage());
        }
    }
}
