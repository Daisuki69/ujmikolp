package com.shield.android.context;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;
import com.paymaya.common.utility.AbstractC1213b;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15149d = {1613165796, 1984001539, 687733362, 614583673, 742988017, 1111016638, 719122936, 874668299, 1508855307};
    private FusedLocationProviderClient dC;
    private LocationRequest dD;
    private LocationSettingsRequest dE;
    private LocationCallback dF;
    private final Context dG;
    private SettingsClient dH;
    private boolean dI;
    private u dJ;
    private Location dK;
    private boolean dL;
    private final String dM;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Context context, String str) {
        boolean z4 = ((int) f15149d[0]) ^ 1613165796;
        this.dI = z4;
        this.dK = null;
        this.dL = z4;
        this.dG = context;
        this.dM = str;
        try {
            this.dC = LocationServices.getFusedLocationProviderClient(context);
            this.dH = LocationServices.getSettingsClient(context);
            LocationRequest locationRequestCreate = LocationRequest.create();
            this.dD = locationRequestCreate;
            locationRequestCreate.setPriority(((int) f15149d[1]) ^ 1984001639);
            this.dD.setFastestInterval(f15149d[2] ^ 687733434);
            this.dD.setInterval(f15149d[3] ^ 614583529);
            this.dF = new LocationCallback() { // from class: com.shield.android.context.m.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15150d = {971561843};

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.location.LocationCallback
                public final void onLocationResult(@NonNull LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    try {
                        Location lastLocation = locationResult.getLastLocation();
                        if (lastLocation == null || m.this.dJ == null) {
                            return;
                        }
                        m.a(m.this, ((int) f15150d[0]) ^ 971561842);
                        m.this.dJ.getLocation(lastLocation);
                    } catch (Exception unused) {
                        m.this.dJ.getLocation(null);
                    }
                }
            };
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
            builder.addLocationRequest(this.dD);
            this.dE = builder.build();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aQ() {
        try {
            try {
                try {
                    try {
                        this.dC.requestLocationUpdates(this.dD, this.dF, Looper.getMainLooper());
                    } catch (IncompatibleClassChangeError unused) {
                        Class<?> cls = this.dC.getClass();
                        String strF = f("耹耯耸耽耪耽耹耀耬耡耠耴耮耩耫耑耫耾耸耬耺耭");
                        long[] jArr = f15149d;
                        Class<?>[] clsArr = new Class[((int) jArr[5]) ^ 1111016637];
                        clsArr[((int) jArr[0]) ^ 1613165796] = LocationRequest.class;
                        clsArr[((int) jArr[4]) ^ 742988016] = LocationCallback.class;
                        clsArr[((int) jArr[6]) ^ 719122938] = Looper.class;
                        Method method = cls.getMethod(strF, clsArr);
                        FusedLocationProviderClient fusedLocationProviderClient = this.dC;
                        long[] jArr2 = f15149d;
                        Object[] objArr = new Object[((int) jArr2[5]) ^ 1111016637];
                        objArr[((int) jArr2[0]) ^ 1613165796] = this.dD;
                        objArr[((int) jArr2[4]) ^ 742988016] = this.dF;
                        objArr[((int) jArr2[6]) ^ 719122938] = Looper.getMainLooper();
                        method.invoke(fusedLocationProviderClient, objArr);
                    }
                } catch (Exception unused2) {
                }
                if (this.dL) {
                    return;
                }
                try {
                    try {
                        try {
                            this.dC.removeLocationUpdates(this.dF);
                        } catch (IncompatibleClassChangeError unused3) {
                            Class<?> cls2 = this.dC.getClass();
                            String strF2 = f("耹耯耤耧耹耫老耣耠耣耵耩耨耨耐耴耿耻耭耽耬");
                            long[] jArr3 = f15149d;
                            Class<?>[] clsArr2 = new Class[((int) jArr3[4]) ^ 742988016];
                            clsArr2[((int) jArr3[0]) ^ 1613165796] = LocationCallback.class;
                            Method method2 = cls2.getMethod(strF2, clsArr2);
                            FusedLocationProviderClient fusedLocationProviderClient2 = this.dC;
                            long[] jArr4 = f15149d;
                            Object[] objArr2 = new Object[742988016 ^ ((int) jArr4[4])];
                            objArr2[((int) jArr4[0]) ^ 1613165796] = this.dF;
                            method2.invoke(fusedLocationProviderClient2, objArr2);
                        }
                    } catch (Exception unused4) {
                    }
                    u uVar = this.dJ;
                    if (uVar != null) {
                        uVar.getLocation(aP());
                    }
                } catch (Exception unused5) {
                    u uVar2 = this.dJ;
                    if (uVar2 != null) {
                        uVar2.getLocation(null);
                    }
                }
            } catch (Exception e) {
                com.shield.android.k.a.dL().a(e);
            }
        } catch (Throwable unused6) {
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15149d[0]) ^ 1613165796;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15149d;
            long j = jArr[7];
            long j6 = jArr[4];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 874701120) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 874701120)) + (((int) j6) ^ 742988016), (~(((int) j) ^ 874701120)) | i4, i6, (((((int) j) ^ 874701120) + cCharAt) + (((int) j6) ^ 742988016)) + ((~(((int) j) ^ 874701120)) | i4)) ^ (i % (((int) jArr[8]) ^ 1508880884))));
            long j7 = f15149d[4];
            int i10 = ~i;
            i = i + (((int) j7) ^ 742988016) + (((int) j7) ^ 742988016) + ((~(((int) j7) ^ 742988016)) | i10) + (((((int) j7) ^ 742988016) + i) - ((((((int) j7) ^ 742988016) + i) + (((int) j7) ^ 742988016)) + ((~(((int) j7) ^ 742988016)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.context.t
    public final void aM() {
        Task<LocationSettingsResponse> taskCheckLocationSettings;
        if (com.shield.android.internal.i.b(this.dG, f("耪耤耭耺耠耧耩聢耳耧耳耭耮耵耶耭耴耴職耙耜耝耘耏耀耍耗耙耙耓耊耘耤耩耨耼耦耡耣")) || com.shield.android.internal.i.b(this.dG, f("耪耤耭耺耠耧耩聢耳耧耳耭耮耵耶耭耴耴職耙耜耝耘耏耀耍耒耟耖耄耆耑耴耦耦耫耮耺耤耣耭"))) {
            boolean z4 = ((int) f15149d[4]) ^ 742988016;
            this.dI = z4;
            if (z4 != 0) {
                try {
                    try {
                        try {
                            taskCheckLocationSettings = this.dH.checkLocationSettings(this.dE);
                        } catch (Exception unused) {
                            taskCheckLocationSettings = null;
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                } catch (IncompatibleClassChangeError unused3) {
                    Class<?> cls = this.dH.getClass();
                    String strF = f("耨耢耬耫耤耂耢耯耢耶耨耯耩耕耠耰耯耳耷耿耬");
                    long[] jArr = f15149d;
                    Class<?>[] clsArr = new Class[((int) jArr[4]) ^ 742988016];
                    clsArr[((int) jArr[0]) ^ 1613165796] = LocationSettingsRequest.class;
                    Method method = cls.getMethod(strF, clsArr);
                    SettingsClient settingsClient = this.dH;
                    long[] jArr2 = f15149d;
                    Object[] objArr = new Object[((int) jArr2[4]) ^ 742988016];
                    objArr[((int) jArr2[0]) ^ 1613165796] = this.dE;
                    taskCheckLocationSettings = (Task) method.invoke(settingsClient, objArr);
                }
                if (taskCheckLocationSettings == null) {
                    return;
                }
                taskCheckLocationSettings.addOnSuccessListener(new B(this));
            }
        }
    }

    @Override // com.shield.android.context.t
    public final void aN() {
        Task<Void> taskRemoveLocationUpdates;
        if (this.dI) {
            try {
                try {
                    taskRemoveLocationUpdates = this.dC.removeLocationUpdates(this.dF);
                } catch (Exception unused) {
                    taskRemoveLocationUpdates = null;
                }
            } catch (IncompatibleClassChangeError unused2) {
                Class<?> cls = this.dC.getClass();
                String strF = f("耹耯耤耧耹耫老耣耠耣耵耩耨耨耐耴耿耻耭耽耬");
                long[] jArr = f15149d;
                Class<?>[] clsArr = new Class[((int) jArr[4]) ^ 742988016];
                clsArr[((int) jArr[0]) ^ 1613165796] = LocationCallback.class;
                Method method = cls.getMethod(strF, clsArr);
                FusedLocationProviderClient fusedLocationProviderClient = this.dC;
                long[] jArr2 = f15149d;
                Object[] objArr = new Object[((int) jArr2[4]) ^ 742988016];
                objArr[((int) jArr2[0]) ^ 1613165796] = this.dF;
                taskRemoveLocationUpdates = (Task) method.invoke(fusedLocationProviderClient, objArr);
            }
            if (taskRemoveLocationUpdates == null) {
                return;
            }
            try {
                taskRemoveLocationUpdates.addOnCompleteListener(new B(this));
            } catch (Exception e) {
                com.shield.android.k.a.dL().a(e);
            }
        }
    }

    @Override // com.shield.android.context.t
    public final void aO() {
        try {
            try {
                this.dC.flushLocations();
            } catch (IncompatibleClassChangeError unused) {
                this.dC.getClass().getMethod(f("耭耦耼耻耧耂耢耯耢耶耨耯耩耵"), new Class[((int) f15149d[0]) ^ 1613165796]).invoke(this.dC, new Object[((int) f15149d[0]) ^ 1613165796]);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.shield.android.context.t
    @SuppressLint({"MissingPermission"})
    public final Location aP() {
        Task<Location> lastLocation;
        try {
            try {
                try {
                    lastLocation = this.dC.getLastLocation();
                } catch (Exception e) {
                    com.shield.android.k.a.dL().a(e);
                }
            } catch (Exception unused) {
                lastLocation = null;
            }
        } catch (IncompatibleClassChangeError unused2) {
            lastLocation = (Task) this.dC.getClass().getMethod(f("耬耯耽耄耮耽耹耀耬耡耠耴耮耩耫"), new Class[((int) f15149d[0]) ^ 1613165796]).invoke(this.dC, new Object[((int) f15149d[0]) ^ 1613165796]);
        }
        if (lastLocation == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(((int) f15149d[4]) ^ 742988016);
        lastLocation.addOnCompleteListener(new C(this, countDownLatch));
        countDownLatch.await(f15149d[5] ^ 1111016637, TimeUnit.SECONDS);
        return this.dK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean a(m mVar, boolean z4) {
        boolean z5 = ((int) f15149d[4]) ^ 742988016;
        mVar.dL = z5;
        return z5;
    }

    @Override // com.shield.android.context.t
    public final void a(u uVar) {
        this.dJ = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CountDownLatch countDownLatch, Task task) {
        try {
            task.addOnSuccessListener(new C(this, countDownLatch));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CountDownLatch countDownLatch, Location location) {
        this.dK = location;
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(LocationSettingsResponse locationSettingsResponse) {
        com.shield.android.internal.i.a(this.dM, ((int) f15149d[4]) ^ 742988016, f("耇耥耪耩耻耧耢耢耐耧耵耴耮耨耢耐耳耨耼耹耻")).submit(new androidx.window.layout.adapter.extensions.a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(Task task) {
        this.dI = ((int) f15149d[0]) ^ 1613165796;
    }
}
