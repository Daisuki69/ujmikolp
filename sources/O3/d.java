package o3;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f18769b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f18770a;

    public synchronized void a() {
        try {
            Integer num = (Integer) this.f18770a.get("r7khp5rhirj501lqn5t6q1chpnc1cis703jd");
            this.f18770a.put("r7khp5rhirj501lqn5t6q1chpnc1cis703jd", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int b() {
        int iIntValue;
        Iterator it = this.f18770a.values().iterator();
        iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        return iIntValue;
    }

    public synchronized int c() {
        Integer num;
        num = (Integer) this.f18770a.get("r7khp5rhirj501lqn5t6q1chpnc1cis703jd");
        return num != null ? num.intValue() : 0;
    }

    public synchronized void d() {
        try {
            Integer num = (Integer) this.f18770a.get("r7khp5rhirj501lqn5t6q1chpnc1cis703jd");
            int iIntValue = (num != null ? num.intValue() : 0) - 1;
            if (iIntValue > 0) {
                this.f18770a.put("r7khp5rhirj501lqn5t6q1chpnc1cis703jd", Integer.valueOf(iIntValue));
            } else {
                this.f18770a.remove("r7khp5rhirj501lqn5t6q1chpnc1cis703jd");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
