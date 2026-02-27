package com.dynatrace.agent.util;

import We.s;
import android.content.Context;
import android.content.pm.PackageManager;
import cj.C1110A;
import cj.C1132s;
import com.dynatrace.agent.common.connectivity.LocalBuild;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.text.MatchResult;
import yj.h;
import yj.i;
import zj.C2576A;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class RootDetector {
    private static final String BINARY_BUSYBOX = "busybox";
    private static final String BINARY_MAGISK = "magisk";
    private static final String BINARY_SU = "su";
    private static final String DEVICE_PROPERTY_FORMAT = "\\[(.*?)]:\\s*\\[(.*?)]";
    private static final String TEST_KEYS = "test-keys";
    private static Boolean cachedIsRooted;
    public static final RootDetector INSTANCE = new RootDetector();
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "RootDetector");
    private static final List<String> knownRootAppsPackages = C1132s.g("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot");
    private static final List<String> knownDangerousAppsPackages = C1132s.g("com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_");
    private static final List<String> knownRootCloakingPackages = C1132s.g("com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot");
    private static final List<String> suPaths = C1132s.g("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/");

    private RootDetector() {
    }

    private final boolean checkBinary(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(it.next(), str);
            if (file.exists()) {
                if (!Global.DEBUG) {
                    return true;
                }
                Utility.zlogD(LOG_TAG, "file detected: " + file);
                return true;
            }
        }
        return false;
    }

    private final boolean checkSuExists() throws Throwable {
        Process process = null;
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
            j.d(processExec);
            try {
                boolean z4 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                processExec.destroy();
                return z4;
            } catch (Exception unused) {
                process = processExec;
                if (process != null) {
                    process.destroy();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                process = processExec;
                if (process != null) {
                    process.destroy();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final boolean isAnyPackageFromListInstalled(List<String> list, Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            try {
                packageManager.getPackageInfo(str, 0);
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "detected package: " + str);
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    private final boolean isDeviceRootedInternal(Context context) {
        if (!checkTestKeys$com_dynatrace_agent_release() && !checkPotentialRootApps$com_dynatrace_agent_release(context)) {
            List<String> listDetermineBinaryPaths$com_dynatrace_agent_release = determineBinaryPaths$com_dynatrace_agent_release();
            if (!checkBinary(listDetermineBinaryPaths$com_dynatrace_agent_release, "su") && !checkBinary(listDetermineBinaryPaths$com_dynatrace_agent_release, BINARY_BUSYBOX) && !checkBinary(listDetermineBinaryPaths$com_dynatrace_agent_release, BINARY_MAGISK)) {
                if (!checkSuExists()) {
                    return false;
                }
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "su command detected");
                }
                return true;
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "suspicious file detected");
            }
        }
        return true;
    }

    public final boolean checkPotentialRootApps$com_dynatrace_agent_release(Context context) {
        j.g(context, "context");
        return isAnyPackageFromListInstalled(knownRootAppsPackages, context) || isAnyPackageFromListInstalled(knownRootCloakingPackages, context) || isAnyPackageFromListInstalled(knownDangerousAppsPackages, context);
    }

    public final boolean checkTestKeys$com_dynatrace_agent_release() {
        String testTags = LocalBuild.INSTANCE.getTestTags();
        boolean z4 = testTags != null ? C2576A.z(testTags, TEST_KEYS, false, 2) : false;
        if (z4 && Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "test-keys detected");
        }
        return z4;
    }

    public final List<String> determineBinaryPaths$com_dynatrace_agent_release() {
        ArrayList arrayListW = C1110A.W(suPaths);
        String str = System.getenv("PATH");
        if (str != null && str.length() != 0) {
            List listT = C2576A.T(str, new String[]{Global.COLON}, 6);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : listT) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            for (String strConcat : arrayList) {
                if (!z.n(strConcat, 2, "/", false)) {
                    strConcat = strConcat.concat("/");
                }
                if (!arrayListW.contains(strConcat)) {
                    arrayListW.add(strConcat);
                }
            }
        }
        return arrayListW;
    }

    public final boolean isDeviceRooted(Context context) {
        j.g(context, "context");
        if (cachedIsRooted == null) {
            cachedIsRooted = Boolean.valueOf(isDeviceRootedInternal(context));
        }
        Boolean bool = cachedIsRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Map<String, String> parseDeviceProperties$com_dynatrace_agent_release(String deviceProperties) {
        j.g(deviceProperties, "deviceProperties");
        i iVarC = o.c(deviceProperties, new o(DEVICE_PROPERTY_FORMAT));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVar = new h(iVarC);
        while (hVar.hasNext()) {
            MatchResult matchResult = (MatchResult) hVar.next();
            linkedHashMap.put((String) matchResult.a().get(1), (String) matchResult.a().get(2));
        }
        return linkedHashMap;
    }
}
