package com.tencent.youtu.sdkkitframework.common;

import androidx.media3.datasource.cache.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class OperateInfoManager {
    public static OperateInfoManager c = new OperateInfoManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f15821a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Long> f15822b = new ArrayList();

    public static OperateInfoManager getInstance() {
        return c;
    }

    public void clear() {
        Map<String, Object> map = this.f15821a;
        if (map != null) {
            map.clear();
        }
        List<Long> list = this.f15822b;
        if (list != null) {
            list.clear();
        }
    }

    public String conservationVideoErrorData(String str, Integer num) {
        HashMap mapQ = c.q("event_id", "conservation_video_message", "info", str);
        mapQ.put("value", Integer.valueOf(num.intValue() == 400104 ? 1 : 0));
        mapQ.put("Done", 1);
        return new JSONObject(mapQ).toString();
    }

    public String makeCatchErrorData() {
        if (this.f15821a == null) {
            this.f15821a = new HashMap();
        }
        ArrayList arrayList = this.f15821a.containsKey("info") ? (ArrayList) this.f15821a.get("info") : new ArrayList();
        this.f15821a.put("info", arrayList.toString());
        this.f15821a.put("value", Integer.valueOf(arrayList.size() == 0 ? 0 : 1));
        this.f15821a.put("event_id", "YTCatchError");
        this.f15821a.put("Done", 1);
        JSONObject jSONObject = new JSONObject(this.f15821a);
        this.f15821a.clear();
        return jSONObject.toString();
    }

    public String makePackUseTime() {
        long jLongValue;
        HashMap mapP = c.p("event_id", "MakePackUseTime");
        mapP.put("Done", 1);
        mapP.put("info", "");
        List<Long> list = this.f15822b;
        if (list != null) {
            Iterator<Long> it = list.iterator();
            jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            this.f15822b.clear();
        } else {
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            return null;
        }
        mapP.put("value", Long.valueOf(jLongValue));
        return new JSONObject(mapP).toString();
    }

    public void setCatchErrorData(String str) {
        if (!this.f15821a.containsKey("info")) {
            this.f15821a.put("info", new ArrayList());
        }
        ((ArrayList) this.f15821a.get("info")).add(str);
    }

    public void setPackUseTime(long j) {
        this.f15822b.add(Long.valueOf(j));
    }
}
