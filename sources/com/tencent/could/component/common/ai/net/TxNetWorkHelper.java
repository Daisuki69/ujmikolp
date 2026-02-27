package com.tencent.could.component.common.ai.net;

import We.s;
import Y.e;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import cf.InterfaceC1099a;
import com.tencent.could.component.common.ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.ai.utils.ThreadPoolUtil;
import dOYHB6.yFtIp6.svM7M6;
import df.C1364f;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jk.b;

/* JADX INFO: loaded from: classes4.dex */
public class TxNetWorkHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Map<String, DnsCacheInfo> f15593a;
    public NetWorkLoggerCallBack c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LOG_LEVEL f15595d = LOG_LEVEL.LEVEL_VERBOSE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set<String> f15594b = new HashSet();

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.net.TxNetWorkHelper$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15600a;

        static {
            int[] iArr = new int[LOG_LEVEL.values().length];
            f15600a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15600a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15600a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15600a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15600a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15600a[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    public static final class TxNetWorkHelperHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TxNetWorkHelper f15602a = new TxNetWorkHelper();
    }

    public static void a(TxNetWorkHelper txNetWorkHelper, Context context, String str, String str2, long j) {
        if (txNetWorkHelper.f15593a == null) {
            txNetWorkHelper.f15593a = new HashMap();
        }
        txNetWorkHelper.f15593a.put(str, new DnsCacheInfo(str, str2, j));
        if (context != null) {
            context.getSharedPreferences("txy_comoon_share_data", 0).edit().putString(str, str2).apply();
        }
        String strI = s.i(str, "_time");
        if (context == null) {
            return;
        }
        context.getSharedPreferences("txy_comoon_share_data", 0).edit().putLong(strI, j).apply();
    }

    public static TxNetWorkHelper getInstance() {
        return TxNetWorkHelperHolder.f15602a;
    }

    public void checkHostName(final Context context, final String str, final boolean z4) {
        ThreadPoolUtil.getInstance().addWork(new Runnable() { // from class: com.tencent.could.component.common.ai.net.TxNetWorkHelper.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TxNetWorkHelper.a(TxNetWorkHelper.this, context, str) || z4) {
                        if (!TxNetWorkHelper.this.f15594b.contains(str)) {
                            TxNetWorkHelper.this.f15594b.add(str);
                        }
                        DnsResolver dnsResolver = new DnsResolver(str);
                        Thread thread = new Thread(dnsResolver);
                        thread.start();
                        thread.join(5000L);
                        if (TxNetWorkHelper.this.f15594b.contains(str)) {
                            TxNetWorkHelper.this.f15594b.remove(str);
                        }
                        InetAddress hasAddress = dnsResolver.getHasAddress();
                        if (hasAddress == null) {
                            TxNetWorkHelper.a(TxNetWorkHelper.this, context, str, "", 0L);
                        } else {
                            TxNetWorkHelper.a(TxNetWorkHelper.this, context, str, hasAddress.getHostAddress(), System.currentTimeMillis());
                        }
                    }
                } catch (Exception e) {
                    TxNetWorkHelper.this.logError("TxNetWorkHelper", "checkHostName, error: " + e.getLocalizedMessage());
                }
            }
        });
    }

    public String getHostNameCurrentIp(Context context, String str) {
        DnsCacheInfo dnsCacheInfo;
        if (this.f15593a != null && (dnsCacheInfo = this.f15593a.get(str)) != null && System.currentTimeMillis() - dnsCacheInfo.getRefreshTime() < 86400000) {
            getInstance().logError("TxNetWorkHelper", "get hostName use cache: " + dnsCacheInfo.getIp());
            return dnsCacheInfo.getIp();
        }
        try {
            long j = context != null ? context.getSharedPreferences("txy_comoon_share_data", 0).getLong(str + "_time", 0L) : 0L;
            if (System.currentTimeMillis() - j > 86400000) {
                if (this.f15594b.contains(str)) {
                    getInstance().logError("TxNetWorkHelper", "do not need update dns!");
                } else {
                    getInstance().logError("TxNetWorkHelper", "need update dns!");
                    checkHostName(context, str, false);
                }
                return "";
            }
            String string = context == null ? EventReportConfig.STRING_INIT : svM7M6.getString(context.getSharedPreferences("txy_comoon_share_data", 0), str, EventReportConfig.STRING_INIT);
            if (!TextUtils.isEmpty(string)) {
                if (this.f15593a == null) {
                    this.f15593a = new HashMap();
                }
                this.f15593a.put(str, new DnsCacheInfo(str, string, j));
            }
            return string;
        } catch (Exception e) {
            Log.e("TxNetWorkHelper", "getHostNameCurrentIp error: " + e.getLocalizedMessage());
            return "";
        }
    }

    public void logDebug(String str, String str2) {
        if (this.c == null || LOG_LEVEL.LEVEL_DEBUG.compareTo(this.f15595d) < 0) {
            Log.d(str, str2);
        } else {
            this.c.logger(str, str2);
        }
    }

    public void logError(String str, String str2) {
        if (this.c == null || LOG_LEVEL.LEVEL_ERROR.compareTo(this.f15595d) < 0) {
            Log.e(str, str2);
        } else {
            this.c.logger(str, str2);
        }
    }

    public void release() {
        if (this.c != null) {
            this.c = null;
        }
        e eVar = b.f17824a;
        if (((C1364f) eVar.f6708b) != null) {
            eVar.f6708b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0018 A[PHI: r2
  0x0018: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x000b, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[PHI: r1
  0x001a: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0008, B:9:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAiNetWorkLevel(com.tencent.could.component.common.ai.net.TxNetWorkHelper.LOG_LEVEL r4) {
        /*
            r3 = this;
            int r4 = r4.ordinal()
            r0 = 1
            if (r4 == 0) goto L1b
            r1 = 2
            if (r4 == r0) goto L1a
            r2 = 3
            if (r4 == r1) goto L18
            r1 = 4
            if (r4 == r2) goto L1a
            r2 = 5
            if (r4 == r1) goto L18
            if (r4 == r2) goto L16
            goto L1b
        L16:
            r0 = 6
            goto L1b
        L18:
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            k2.v0.f18022d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.component.common.ai.net.TxNetWorkHelper.setAiNetWorkLevel(com.tencent.could.component.common.ai.net.TxNetWorkHelper$LOG_LEVEL):void");
    }

    public void setLoggerCallBack(NetWorkLoggerCallBack netWorkLoggerCallBack) {
        setLoggerCallBack(netWorkLoggerCallBack, this.f15595d);
    }

    public void setLoggerCallBack(final NetWorkLoggerCallBack netWorkLoggerCallBack, LOG_LEVEL log_level) {
        this.c = netWorkLoggerCallBack;
        this.f15595d = log_level;
        b.f17824a.c = new InterfaceC1099a(this) { // from class: com.tencent.could.component.common.ai.net.TxNetWorkHelper.1
            @Override // cf.InterfaceC1099a
            public void logger(String str, String str2) {
                NetWorkLoggerCallBack netWorkLoggerCallBack2 = netWorkLoggerCallBack;
                if (netWorkLoggerCallBack2 != null) {
                    netWorkLoggerCallBack2.logger(str, str2);
                }
            }
        };
    }

    public static boolean a(TxNetWorkHelper txNetWorkHelper, Context context, String str) {
        String string;
        DnsCacheInfo dnsCacheInfo;
        if (txNetWorkHelper.f15593a == null || (dnsCacheInfo = txNetWorkHelper.f15593a.get(str)) == null) {
            try {
                long j = context != null ? context.getSharedPreferences("txy_comoon_share_data", 0).getLong(str + "_time", 0L) : 0L;
                if (System.currentTimeMillis() - j > 86400000) {
                    getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut is timeout");
                    return true;
                }
                if (context == null) {
                    string = EventReportConfig.STRING_INIT;
                } else {
                    string = svM7M6.getString(context.getSharedPreferences("txy_comoon_share_data", 0), str, EventReportConfig.STRING_INIT);
                }
                if (!TextUtils.isEmpty(string)) {
                    if (txNetWorkHelper.f15593a == null) {
                        txNetWorkHelper.f15593a = new HashMap();
                    }
                    txNetWorkHelper.f15593a.put(str, new DnsCacheInfo(str, string, j));
                }
            } catch (Exception e) {
                getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut e: " + e.getLocalizedMessage());
                return true;
            }
        } else if (System.currentTimeMillis() - dnsCacheInfo.getRefreshTime() > 86400000) {
            getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut is timeout in cache");
            return true;
        }
        return false;
    }
}
