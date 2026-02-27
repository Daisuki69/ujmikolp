package dOYHB6.yFtIp6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import dOYHB6.cYHhs8;
import dOYHB6.nm8AQ4;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ht2aO8 {
    private static BroadcastReceiver s_eventsReceiver = null;
    private static HashMap<String, jsqyZ9> eventListeners = new HashMap<>();
    private static Map<BroadcastReceiver, List<String>> registeredReceiversToNames = new ConcurrentHashMap();
    private static Map<String, List<BroadcastReceiver>> registeredNamesToReceivers = new ConcurrentHashMap();
    private static String devEventsPermission = null;

    public interface jsqyZ9 {
        void OnEventReceived(Bundle bundle);
    }

    public static final String c9DRP8() {
        return numX49.tnTj78("bHfH");
    }

    public static void d90yA0(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        String strTnTj78 = numX49.tnTj78("bHft");
        try {
            k8eKc5(obj, obj.getClass().getMethod(strTnTj78, BroadcastReceiver.class, IntentFilter.class), broadcastReceiver, intentFilter);
        } catch (NoSuchMethodException e) {
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod(strTnTj78, BroadcastReceiver.class, IntentFilter.class);
                declaredMethod.setAccessible(true);
                k8eKc5(obj, declaredMethod, broadcastReceiver, intentFilter);
            } catch (Exception e7) {
                cYHhs8.gWQKs2(e7, false);
            }
        } catch (Exception e10) {
            cYHhs8.gWQKs2(e10, false);
        }
    }

    private static synchronized void hVlRD7(BroadcastReceiver broadcastReceiver, String str) {
        fChUQ4.m98dn7(str);
        if (!registeredReceiversToNames.containsKey(broadcastReceiver)) {
            registeredReceiversToNames.put(broadcastReceiver, new LinkedList());
        }
        registeredReceiversToNames.get(broadcastReceiver).add(str);
        w4LZ92(broadcastReceiver, str);
    }

    private static void iwu7R7() {
        if (s_eventsReceiver != null) {
            return;
        }
        s_eventsReceiver = new BroadcastReceiver() { // from class: dOYHB6.yFtIp6.ht2aO8.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                jsqyZ9 jsqyz9;
                String action = intent.getAction();
                Bundle extras = intent.getExtras();
                if (action == null) {
                    return;
                }
                if (extras == null) {
                    extras = new Bundle();
                }
                if (!ht2aO8.eventListeners.containsKey(action) || (jsqyz9 = (jsqyZ9) ht2aO8.eventListeners.get(action)) == null) {
                    return;
                }
                jsqyz9.OnEventReceived(extras);
            }
        };
    }

    public static void k8eKc5(Object obj, Method method, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Exception {
        method.invoke(obj, broadcastReceiver, intentFilter);
        nluQL9(broadcastReceiver, intentFilter);
    }

    private static void kwuEW7(BroadcastReceiver broadcastReceiver, String str) {
        nJ5Ou7(str);
        hVlRD7(broadcastReceiver, str);
    }

    public static boolean m8Dak6(IntentFilter intentFilter) {
        return intentFilter.countActions() > 0;
    }

    public static void nJ5Ou7(String str) {
        iwu7R7();
        Context context = nm8AQ4.get();
        if (context == null || eventListeners.containsKey(str)) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(str);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(s_eventsReceiver, intentFilter, szBXG1(), null, 4);
        } else {
            context.registerReceiver(s_eventsReceiver, intentFilter, szBXG1(), null);
        }
        rQ0mc0(numX49.tnTj78("bHfO"), context, s_eventsReceiver, intentFilter);
        rQ0mc0(numX49.tnTj78("bHfQ"), context, s_eventsReceiver, intentFilter);
    }

    private static void nXAwT3(String str) {
        fChUQ4.eiF7u8(str);
    }

    private static void nluQL9(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        for (int i = 0; i < intentFilter.countActions(); i++) {
            String action = intentFilter.getAction(i);
            nJ5Ou7(action);
            hVlRD7(broadcastReceiver, action);
        }
    }

    public static void rQ0mc0(String str, Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            Class<?> cls = Class.forName(str);
            cls.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), broadcastReceiver, intentFilter);
        } catch (Exception e) {
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (intentFilter == null || broadcastReceiver == null) {
            return null;
        }
        return registerReceiver(nm8AQ4.get(), broadcastReceiver, intentFilter);
    }

    public static Intent registerReceiver(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            IntentFilter intentFilterUWEIc8 = uWEIc8(obj, broadcastReceiver, intentFilter, null, 0);
            if (intentFilterUWEIc8.countActions() > 0) {
                return ((Context) obj).registerReceiver(broadcastReceiver, intentFilterUWEIc8);
            }
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
        }
        return null;
    }

    public static Intent registerReceiver(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            IntentFilter intentFilterUWEIc8 = uWEIc8(obj, broadcastReceiver, intentFilter, null, i);
            if (intentFilterUWEIc8.countActions() > 0) {
                return ((Context) obj).registerReceiver(broadcastReceiver, intentFilterUWEIc8, i);
            }
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
        }
        return null;
    }

    public static Intent registerReceiver(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            IntentFilter intentFilterUWEIc8 = uWEIc8(obj, broadcastReceiver, intentFilter, handler, 0);
            if (intentFilterUWEIc8.countActions() > 0) {
                return ((Context) obj).registerReceiver(broadcastReceiver, intentFilterUWEIc8, str, handler);
            }
            return null;
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
            return null;
        }
    }

    public static Intent registerReceiver(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            IntentFilter intentFilterUWEIc8 = uWEIc8(obj, broadcastReceiver, intentFilter, handler, i);
            if (intentFilterUWEIc8.countActions() > 0) {
                return ((Context) obj).registerReceiver(broadcastReceiver, intentFilterUWEIc8, str, handler, i);
            }
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
        }
        return null;
    }

    public static boolean slA3q7(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (intentFilter == null || !m8Dak6(intentFilter)) {
            return false;
        }
        return fChUQ4.h4HHR8(intentFilter.getAction(0));
    }

    public static String szBXG1() {
        if (TextUtils.isEmpty(devEventsPermission)) {
            devEventsPermission = qOnQ39.getString(numX49.tnTj78("bHfF"), fChUQ4.eoxVg5() + numX49.tnTj78("bHfE"));
        }
        return devEventsPermission;
    }

    public static Intent tRMLV0(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return tRMLV0(obj, broadcastReceiver, intentFilter, handler, str, 0);
            }
            Intent intentRegisterReceiver = ((Context) obj).registerReceiver(broadcastReceiver, intentFilter, szBXG1(), handler);
            kwuEW7(broadcastReceiver, str);
            return intentRegisterReceiver;
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
            return null;
        }
    }

    public static Intent tRMLV0(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, String str, int i) {
        try {
            Intent intentRegisterReceiver = ((Context) obj).registerReceiver(broadcastReceiver, intentFilter, szBXG1(), handler, Build.VERSION.SDK_INT >= 33 ? 4 : 0);
            kwuEW7(broadcastReceiver, str);
            return intentRegisterReceiver;
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
            return null;
        }
    }

    private static IntentFilter uWEIc8(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
        IntentFilter intentFilter2 = new IntentFilter();
        String[] strArr = new String[intentFilter.countActions()];
        for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
            strArr[i4] = intentFilter.getAction(i4);
        }
        boolean[] zArrEb5FH2 = fChUQ4.eb5FH2(strArr);
        for (int i6 = 0; i6 < zArrEb5FH2.length; i6++) {
            if (!zArrEb5FH2[i6]) {
                intentFilter2.addAction(strArr[i6]);
            } else if (i == 0) {
                tRMLV0(obj, broadcastReceiver, intentFilter, handler, strArr[i6]);
            } else {
                tRMLV0(obj, broadcastReceiver, intentFilter, handler, strArr[i6], i);
            }
        }
        return intentFilter2;
    }

    public static void unregisterReceiver(Object obj, BroadcastReceiver broadcastReceiver) {
        uoe110(obj, broadcastReceiver);
    }

    private static synchronized void uoe110(Object obj, BroadcastReceiver broadcastReceiver) {
        try {
            obj.getClass().getMethod("unregisterReceiver", BroadcastReceiver.class).invoke(obj, broadcastReceiver);
            List<String> listRemove = registeredReceiversToNames.remove(broadcastReceiver);
            if (listRemove != null && listRemove.size() > 0) {
                for (String str : listRemove) {
                    if (registeredNamesToReceivers.containsKey(str)) {
                        List<BroadcastReceiver> list = registeredNamesToReceivers.get(str);
                        list.remove(broadcastReceiver);
                        if (list.size() < 1) {
                            registeredNamesToReceivers.remove(str);
                            nXAwT3(str);
                        }
                    }
                }
            }
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
        }
    }

    private static synchronized void w4LZ92(BroadcastReceiver broadcastReceiver, String str) {
        if (!registeredNamesToReceivers.containsKey(str)) {
            registeredNamesToReceivers.put(str, new LinkedList());
        }
        registeredNamesToReceivers.get(str).add(broadcastReceiver);
    }

    public static void wSeSy0(String str, jsqyZ9 jsqyz9) {
        whbga0(str, jsqyz9, false);
    }

    public static void whbga0(String str) {
        whbga0(str, null);
    }

    public static void whbga0(String str, jsqyZ9 jsqyz9) {
        whbga0(str, jsqyz9, true);
    }

    private static synchronized void whbga0(String str, jsqyZ9 jsqyz9, boolean z4) {
        String strBWRSE4 = fChUQ4.bWRSE4(str);
        if (TextUtils.isEmpty(strBWRSE4)) {
            return;
        }
        nJ5Ou7(strBWRSE4);
        fChUQ4.m98dn7(strBWRSE4);
        eventListeners.put(strBWRSE4, jsqyz9);
    }
}
