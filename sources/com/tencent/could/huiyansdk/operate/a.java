package com.tencent.could.huiyansdk.operate;

import We.s;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.j;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.ai.log.AiLog;
import com.tencent.could.component.common.ai.net.HttpMethod;
import com.tencent.could.component.common.ai.net.IJsonDataListener;
import com.tencent.could.component.common.ai.net.TXCHttp;
import com.tencent.could.component.common.ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.d;
import com.tencent.could.huiyansdk.utils.i;
import defpackage.AbstractC1414e;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HuiYanOperateBody f15705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Long> f15706b = new ArrayMap(10);

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a$a, reason: collision with other inner class name */
    public class C0085a implements IJsonDataListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f15708b;

        public C0085a(a aVar, boolean z4, File file) {
            this.f15707a = z4;
            this.f15708b = file;
        }

        @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
        public void onFailed(String str) {
            e.a.f15688a.a(2, "OperateInfoManager", "007 onFailed s:" + str);
        }

        @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
        public void onSuccess(String str) {
            File file;
            e eVar = e.a.f15688a;
            eVar.a(1, "OperateInfoManager", "upload 007 info success! " + str);
            if (!this.f15707a || (file = this.f15708b) == null || file.delete()) {
                return;
            }
            eVar.a(2, "OperateInfoManager", "upload content success, but delete file error : path " + this.f15708b.getAbsolutePath());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15709a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String str;
        Context contextA = HuiYanBaseApi.a.f15622a.a();
        if (contextA == null) {
            e.a.f15688a.a(2, "OperateInfoManager", "current context is null!");
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder("cloud-huiyan");
            String str2 = File.separator;
            str = contextA.getFilesDir() + str2 + s.p(sb2, str2, "operate");
        }
        if (TextUtils.isEmpty(str)) {
            e.a.f15688a.a(2, "OperateInfoManager", "dirPath is empty!");
            return;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.isDirectory()) {
                try {
                    if (file.lastModified() < System.currentTimeMillis() - 259200000 && !file.delete()) {
                        e.a.f15688a.a(2, "OperateInfoManager", "delete file error : path " + file.getCanonicalPath());
                    }
                } catch (IOException e) {
                    e.a.f15688a.a(2, "OperateInfoManager", "readAnCheckLocalFile error : " + e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z4, File file) {
        TwoTuple<String, String> twoTupleA = com.tencent.could.huiyansdk.api.e.a(false);
        if (twoTupleA == null) {
            e.a.f15688a.a(2, "OperateInfoManager", "getRequestConnectIp is null!");
            return;
        }
        String strP = s.p(new StringBuilder(), twoTupleA.first, "/api/sdk/monitor/reportV1");
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strP).setDeputyUrl(s.p(new StringBuilder(), twoTupleA.second, "/api/sdk/monitor/reportV1")).setHttpMethod(HttpMethod.POST).setRequestHeaders(null).setGzip(true).setRequestData(str).createNetWorkParam(), new C0085a(this, z4, file));
    }

    public final void a() {
        i.a.f15743a.a(new androidx.window.layout.adapter.extensions.a(this, 28));
    }

    public final void a(String str, boolean z4, File file) {
        if (TextUtils.isEmpty(str)) {
            e.a.f15688a.a(2, "OperateInfoManager", "doUploadInfo content is empty!");
        } else {
            e.a.f15688a.a(2, "OperateInfoManager", "real upload info!");
            i.a.f15743a.a(new androidx.work.impl.a(2, this, str, z4));
        }
    }

    public void a(int i, String str) {
        String str2 = i + "";
        HuiYanOperateBody huiYanOperateBody = this.f15705a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.setErrorCode(str2);
            this.f15705a.setErrorMessage(str);
        }
    }

    public void a(String str, int i, long j, String str2) {
        String str3;
        String str4;
        HuiYanOperateBody huiYanOperateBody = this.f15705a;
        if (huiYanOperateBody != null) {
            str3 = str;
            str4 = str2;
            huiYanOperateBody.updateInfo(str3, i, j, System.currentTimeMillis(), str4);
        } else {
            str3 = str;
            str4 = str2;
        }
        if ("Crash".equals(str3)) {
            d dVar = d.a.f15733a;
            String strH = AbstractC1414e.h("get crash: ", str4);
            if (dVar.f15731a) {
                AiLog.error("OperateInfoManager", strH);
            }
        }
    }

    public void b() {
        String strK;
        try {
            strK = new j().k((HuiYanOperateBody) this.f15705a.clone());
        } catch (Exception e) {
            e.a.f15688a.a(2, "OperateInfoManager", e.getMessage());
            strK = "";
        }
        a(strK, false, (File) null);
    }

    public void a(String str, int i, boolean z4, String str2) {
        Exception exc;
        String str3;
        a aVar;
        try {
        } catch (Exception e) {
            exc = e;
            str3 = str;
        }
        if (i == 1) {
            this.f15706b.put(str, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        if (i == 2) {
            try {
                if (!this.f15706b.containsKey(str)) {
                    e.a.f15688a.a(2, "OperateInfoManager", "not found event start:" + str);
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f15706b.get(str).longValue();
                if (jCurrentTimeMillis > 0) {
                    if (z4) {
                        str3 = str;
                        try {
                            a(str3, -1, jCurrentTimeMillis, str2);
                            aVar = this;
                        } catch (Exception e7) {
                            exc = e7;
                        }
                    } else {
                        str3 = str;
                        aVar = this;
                        try {
                            aVar.a(str3, 1, jCurrentTimeMillis, str2);
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                    aVar.f15706b.remove(str3);
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                str3 = str;
            }
            exc = e;
            d dVar = d.a.f15733a;
            StringBuilder sbW = s.w("opOperateTimeEvent error! action: ", str3, " exc: ");
            sbW.append(exc.getLocalizedMessage());
            String string = sbW.toString();
            if (dVar.f15731a) {
                AiLog.error("OperateInfoManager", string);
            }
        }
    }
}
