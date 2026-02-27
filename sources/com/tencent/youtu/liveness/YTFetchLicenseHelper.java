package com.tencent.youtu.liveness;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class YTFetchLicenseHelper {

    /* JADX INFO: renamed from: com.tencent.youtu.liveness.YTFetchLicenseHelper$1FetchThreadRunnable, reason: invalid class name */
    public class C1FetchThreadRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FetchLicenseResult f15794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15795b;
        public final /* synthetic */ String c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f15796d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f15797g;
        public final /* synthetic */ String h;

        public C1FetchThreadRunnable(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f15795b = str;
            this.c = str2;
            this.f15796d = str3;
            this.e = str4;
            this.f = str5;
            this.f15797g = str6;
            this.h = str7;
            this.f15794a = new FetchLicenseResult(YTFetchLicenseHelper.this);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpsURLConnection httpsURLConnection;
            StringBuilder sb2;
            BufferedReader bufferedReader = null;
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    String str = this.f15795b + Global.HYPHEN + jCurrentTimeMillis;
                    Mac mac = Mac.getInstance("HmacSHA256");
                    mac.init(new SecretKeySpec(this.c.getBytes(), "HmacSHA256"));
                    String strEncodeToString = Base64.encodeToString(mac.doFinal(str.getBytes()), 2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", this.f15795b);
                    jSONObject.put("auth_string", strEncodeToString);
                    jSONObject.put("machine_type", this.f15796d);
                    jSONObject.put("machine_id", this.e);
                    jSONObject.put("machine_info", this.f);
                    jSONObject.put("package_name", this.f15797g);
                    jSONObject.put("time_stamp", jCurrentTimeMillis);
                    String string = jSONObject.toString();
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.h).openConnection());
                    Callback.openConnection(uRLConnection);
                    httpsURLConnection = (HttpsURLConnection) uRLConnection;
                    try {
                        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.setUseCaches(false);
                        httpsURLConnection.setInstanceFollowRedirects(false);
                        httpsURLConnection.setRequestProperty("Content-type", "application/json");
                        httpsURLConnection.setConnectTimeout(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                        httpsURLConnection.setReadTimeout(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                        Callback.connect((HttpURLConnection) httpsURLConnection);
                        DataOutputStream dataOutputStream = new DataOutputStream(Callback.getOutputStream((HttpURLConnection) httpsURLConnection));
                        dataOutputStream.write(string.getBytes());
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        this.f15794a.http_status = Callback.getResponseCode(httpsURLConnection);
                    } catch (MalformedURLException e) {
                        e = e;
                    } catch (ProtocolException e7) {
                        e = e7;
                    } catch (SocketTimeoutException e10) {
                        e = e10;
                    } catch (IOException e11) {
                        e = e11;
                    } catch (InvalidKeyException e12) {
                        e = e12;
                    } catch (NoSuchAlgorithmException e13) {
                        e = e13;
                    } catch (JSONException e14) {
                        e = e14;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (MalformedURLException e15) {
                e = e15;
                httpsURLConnection = null;
            } catch (ProtocolException e16) {
                e = e16;
                httpsURLConnection = null;
            } catch (SocketTimeoutException e17) {
                e = e17;
                httpsURLConnection = null;
            } catch (IOException e18) {
                e = e18;
                httpsURLConnection = null;
            } catch (InvalidKeyException e19) {
                e = e19;
                httpsURLConnection = null;
            } catch (NoSuchAlgorithmException e20) {
                e = e20;
                httpsURLConnection = null;
            } catch (JSONException e21) {
                e = e21;
                httpsURLConnection = null;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = null;
            }
            if (this.f15794a.http_status == 200) {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Callback.getInputStream((HttpURLConnection) httpsURLConnection)));
                try {
                    sb2 = new StringBuilder();
                } catch (MalformedURLException e22) {
                    e = e22;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e23) {
                            e23.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (ProtocolException e24) {
                    e = e24;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e25) {
                            e25.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (SocketTimeoutException e26) {
                    e = e26;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e27) {
                            e27.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (IOException e28) {
                    e = e28;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e29) {
                            e29.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (InvalidKeyException e30) {
                    e = e30;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e31) {
                            e31.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (NoSuchAlgorithmException e32) {
                    e = e32;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e33) {
                            e33.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (JSONException e34) {
                    e = e34;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e35) {
                            e35.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e36) {
                            e36.printStackTrace();
                        }
                    }
                    if (httpsURLConnection == null) {
                        throw th;
                    }
                    httpsURLConnection.disconnect();
                    throw th;
                }
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb2.append(line);
                    }
                    httpsURLConnection.disconnect();
                }
                JSONObject jSONObject2 = new JSONObject(sb2.toString());
                if (jSONObject2.has(StateEvent.Name.ERROR_CODE)) {
                    this.f15794a.error_code = jSONObject2.optInt(StateEvent.Name.ERROR_CODE);
                    this.f15794a.error_msg = jSONObject2.optString("error_msg");
                    FetchLicenseResult fetchLicenseResult = this.f15794a;
                    if (fetchLicenseResult.error_code == 0) {
                        fetchLicenseResult.license = jSONObject2.optString("license");
                        this.f15794a.bind_type = jSONObject2.optString("bind_type");
                        this.f15794a.auth_type = jSONObject2.optString("auth_type");
                    }
                }
                bufferedReader = bufferedReader2;
            } else {
                Log.e("YTCommon_FetchLicense", "connection status: " + this.f15794a.http_status);
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e37) {
                    e37.printStackTrace();
                }
            }
            httpsURLConnection.disconnect();
        }
    }

    public class FetchLicenseResult {
        public int error_code = 1002;
        public int http_status = -1;
        public String error_msg = "";
        public String license = "";
        public String bind_type = "";
        public String auth_type = "";

        public FetchLicenseResult(YTFetchLicenseHelper yTFetchLicenseHelper) {
        }
    }

    public FetchLicenseResult fetchLicenseOnline(Context context, String str, String str2, String str3, YTDeviceInfo yTDeviceInfo) {
        C1FetchThreadRunnable c1FetchThreadRunnable = new C1FetchThreadRunnable(str2, str3, yTDeviceInfo == null ? "ANDROID" : yTDeviceInfo.platform, yTDeviceInfo == null ? "" : yTDeviceInfo.device_id, yTDeviceInfo != null ? yTDeviceInfo.device_info_encrypted : "", context.getPackageName(), str);
        Thread thread = new Thread(c1FetchThreadRunnable);
        try {
            thread.start();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return c1FetchThreadRunnable.f15794a;
    }
}
