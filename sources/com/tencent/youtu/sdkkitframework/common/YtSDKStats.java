package com.tencent.youtu.sdkkitframework.common;

import androidx.media3.datasource.cache.c;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class YtSDKStats extends YtFSMBaseState {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static YtSDKStats f15831g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, Object> f15832a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15833b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15834d;
    public String e;
    public long f;

    public static synchronized void clearInstance() {
        if (f15831g != null) {
            f15831g = null;
        }
    }

    public static synchronized YtSDKStats getInstance() {
        YtSDKStats ytSDKStats = f15831g;
        if (ytSDKStats != null) {
            return ytSDKStats;
        }
        YtSDKStats ytSDKStats2 = new YtSDKStats();
        f15831g = ytSDKStats2;
        return ytSDKStats2;
    }

    public static String getNowTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    public final void a(String str, String str2, HashMap<String, Object> map, String str3, String str4) {
        HashMap<String, Object> map2 = new HashMap<>();
        HashMap mapQ = c.q("state_id", str, "state_action", str2);
        if (map != null) {
            mapQ.put("state_error", map);
        }
        if (str3 != null) {
            mapQ.put("state_cost", str3);
        }
        if (str4 != null) {
            mapQ.put("state_info", str4);
        }
        map2.put(StateEvent.Name.STATE_STATS, mapQ);
        YtFSM.getInstance().sendFSMEvent(map2);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enterState(java.lang.String r10) {
        /*
            r9 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r9.f15832a
            java.lang.Object r0 = r0.get(r10)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r1 = "enter"
            r9.c = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L2f
            r9.exitState()
            java.lang.String r1 = r9.c
            if (r1 == 0) goto L2f
            long r1 = java.lang.System.currentTimeMillis()
            r9.f = r1
            r9.f15833b = r10
            java.lang.String r5 = r9.c
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = r9
            r4 = r10
            r3.a(r4, r5, r6, r7, r8)
            goto L31
        L2f:
            r3 = r9
            r4 = r10
        L31:
            int r0 = r0 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.f15832a
            r0.put(r4, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.YtSDKStats.enterState(java.lang.String):void");
    }

    public void exitState() {
        if (this.f15833b != null) {
            a(this.f15833b, "exit", null, Long.toString(System.currentTimeMillis() - this.f), null);
        }
    }

    public void registerStateName(String str) {
        this.f15832a.put(str, 0);
    }

    public void reportError(int i, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
        map.put("error_msg", str);
        a(this.f15833b, this.c, map, null, null);
    }

    public void reportEvent(int i) {
        HashMap<String, Object> map = new HashMap<>();
        HashMap map2 = new HashMap();
        map2.put("action_type", Integer.valueOf(i));
        map.put(StateEvent.Name.STATE_STATS, map2);
        YtFSM.getInstance().sendFSMEvent(map);
    }

    public void reportInfo(String str) {
        String str2 = this.e;
        if (str2 == null || !str2.equals(str)) {
            this.e = str;
        }
        a(this.f15833b, this.c, null, null, str);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        Iterator<String> it = this.f15832a.keySet().iterator();
        while (it.hasNext()) {
            this.f15832a.put(it.next(), 0);
        }
        this.f15833b = null;
        this.f15834d = null;
        this.e = null;
    }

    public void updateState(String str) {
        this.c = "update";
        String str2 = this.f15834d;
        if (str2 == null || !str2.equals(this.f15833b)) {
            String str3 = this.f15833b;
            this.f15834d = str3;
            a(str3, this.c, null, null, null);
        }
    }
}
