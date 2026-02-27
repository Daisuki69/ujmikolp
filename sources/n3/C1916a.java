package n3;

import Ch.c;
import M5.f;
import Ne.d;
import We.s;
import Xh.b;
import android.app.Activity;
import android.location.Geocoder;
import android.net.Uri;
import bg.AbstractC0983W;
import cg.InterfaceC1101b;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.perf.session.SessionManager;
import hh.InterfaceC1571d;
import hh.o;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import o3.C1960c;
import okhttp3.logging.HttpLoggingInterceptor;
import q3.C2161a;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1916a implements c, InterfaceC1101b, f, Q3.c, o, InterfaceC1571d, b2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18590a;

    public /* synthetic */ C1916a(int i) {
        this.f18590a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static W0.c a(String str) {
        j.g(str, "str");
        switch (str.hashCode()) {
            case -1269022963:
                if (str.equals("phoneLabels")) {
                    return W0.c.f6175l;
                }
                break;
            case -835992323:
                if (str.equals("namePrefix")) {
                    return W0.c.c;
                }
                break;
            case -818219584:
                if (str.equals("middleName")) {
                    return W0.c.e;
                }
                break;
            case -747304516:
                if (str.equals("nameSuffix")) {
                    return W0.c.f6173g;
                }
                break;
            case -549074945:
                if (str.equals("jobDescription")) {
                    return W0.c.j;
                }
                break;
            case 798554127:
                if (str.equals("familyName")) {
                    return W0.c.f;
                }
                break;
            case 848184146:
                if (str.equals("department")) {
                    return W0.c.i;
                }
                break;
            case 950484093:
                if (str.equals("company")) {
                    return W0.c.h;
                }
                break;
            case 1469046696:
                if (str.equals("givenName")) {
                    return W0.c.f6172d;
                }
                break;
            case 1626709862:
                if (str.equals("emailAddresses")) {
                    return W0.c.m;
                }
                break;
            case 1663005371:
                if (str.equals("emailLabels")) {
                    return W0.c.f6176n;
                }
                break;
            case 1672646908:
                if (str.equals("phoneNumbers")) {
                    return W0.c.f6174k;
                }
                break;
            case 1714148973:
                if (str.equals("displayName")) {
                    return W0.c.f6171b;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown field: ".concat(str));
    }

    public static d b(Activity activity) {
        boolean z4 = false;
        try {
            z4 = activity.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
        } catch (Exception unused) {
            yk.a.b();
        }
        if (!z4) {
            yk.a.c();
            return null;
        }
        long j = ((long) 1) * 1000;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity);
        SettingsClient settingsClient = LocationServices.getSettingsClient(activity);
        LocationRequest locationRequestCreate = LocationRequest.create();
        j.f(locationRequestCreate, "create(...)");
        locationRequestCreate.setExpirationDuration(((long) 1) * j * 1000);
        locationRequestCreate.setFastestInterval(j / ((long) 5));
        locationRequestCreate.setInterval(j);
        locationRequestCreate.setNumUpdates(1);
        locationRequestCreate.setPriority(100);
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        builder.addLocationRequest(locationRequestCreate);
        LocationSettingsRequest locationSettingsRequestBuild = builder.build();
        Geocoder geocoder = new Geocoder(activity);
        if (fusedLocationProviderClient == null) {
            j.n("fusedLocationClient");
            throw null;
        }
        if (settingsClient == null) {
            j.n("settingsClient");
            throw null;
        }
        if (locationSettingsRequestBuild != null) {
            return new d(activity, fusedLocationProviderClient, settingsClient, locationRequestCreate, locationSettingsRequestBuild, geocoder);
        }
        j.n("locationSettingsRequest");
        throw null;
    }

    public static URL c(URI uri) {
        Uri.Builder builder = new Uri.Builder();
        builder.encodedAuthority(uri.getAuthority()).encodedFragment(uri.getFragment()).scheme(uri.getScheme()).encodedQuery(uri.getQuery());
        try {
            builder.encodedPath(uri.getPath());
        } catch (IllegalArgumentException e) {
            Ri.a.f(e);
        }
        try {
            return new URL(builder.build().toString());
        } catch (MalformedURLException e7) {
            Ri.a.g(e7.getMessage());
            return null;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
    }

    @Override // M5.f
    public String d() {
        switch (this.f18590a) {
            case 6:
                return String.format("SELECT * FROM %1$s ORDER BY %2$s", "bank", "bank_name");
            case 7:
                return String.format("SELECT * FROM %1$s", "fund_source");
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" LIMIT 1", Arrays.copyOf(new Object[]{"shop_provider_category", AppMeasurementSdk.ConditionalUserProperty.NAME, "Load"}, 3));
        }
    }

    @Override // Q3.c
    public void g(Q3.d dVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!dVar.b()) {
                break;
            }
            sb2.append(dVar.a());
            int i = dVar.f5208d + 1;
            dVar.f5208d = i;
            if (AbstractC0983W.s(dVar.f5206a, i, 5) != 5) {
                dVar.e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        StringBuilder sb3 = dVar.c;
        int length2 = sb3.length() + length + 1;
        dVar.c(length2);
        boolean z4 = dVar.f.f5214b - length2 > 0;
        if (dVar.b() || z4) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException(s.f(length, "Message length not in valid ranges: "));
                }
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i4 = 0; i4 < length3; i4++) {
            int length4 = (((sb3.length() + 1) * 149) % 255) + 1 + sb2.charAt(i4);
            if (length4 > 255) {
                length4 -= 256;
            }
            dVar.d((char) length4);
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f18590a) {
            case 5:
                SessionManager sessionManager = SessionManager.getInstance();
                AbstractC1955a.d(sessionManager);
                return sessionManager;
            default:
                HttpLoggingInterceptor level = new HttpLoggingInterceptor(new C2.f(9)).setLevel(HttpLoggingInterceptor.Level.NONE);
                AbstractC1955a.d(level);
                return level;
        }
    }

    @Override // hh.o
    public boolean test(Object obj) {
        throw null;
    }

    public String toString() {
        switch (this.f18590a) {
            case 2:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // b2.c
    public Object v(b bVar) {
        switch (this.f18590a) {
            case 27:
                return new C2161a();
            default:
                return new C1960c(bVar.d(C1916a.class));
        }
    }

    public /* synthetic */ C1916a(Object obj, int i) {
        this.f18590a = i;
    }
}
