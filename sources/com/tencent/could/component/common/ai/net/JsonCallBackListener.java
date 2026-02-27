package com.tencent.could.component.common.ai.net;

import android.os.Handler;
import android.os.Looper;
import com.tencent.could.component.common.ai.utils.GZipUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public class JsonCallBackListener implements CallBackListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IJsonDataListener f15572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f15573b = new Handler(Looper.getMainLooper());

    public JsonCallBackListener(IJsonDataListener iJsonDataListener) {
        this.f15572a = iJsonDataListener;
    }

    @Override // com.tencent.could.component.common.ai.net.CallBackListener
    public void cleanListener() {
        if (this.f15572a != null) {
            this.f15572a = null;
        }
    }

    public String inputGzipConvertToString(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[4096];
            } finally {
            }
        } catch (IOException e) {
            TxNetWorkHelper.getInstance().logError("JsonCallBackListener", "Gzip ConvertToString error! " + e.getMessage());
            return null;
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                String strUncompressToString = GZipUtils.uncompressToString(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
                return strUncompressToString;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            TxNetWorkHelper.getInstance().logError("JsonCallBackListener", "Gzip ConvertToString error! " + e.getMessage());
            return null;
        }
    }

    public String inputStreamConvertToString(InputStream inputStream) {
        try {
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                sb2.append(line);
            }
        } catch (IOException e) {
            TxNetWorkHelper.getInstance().logError("JsonCallBackListener", "ConvertToString error! " + e.getMessage());
            return null;
        }
    }

    @Override // com.tencent.could.component.common.ai.net.CallBackListener
    public void onFailed(final String str) {
        this.f15573b.post(new Runnable() { // from class: com.tencent.could.component.common.ai.net.JsonCallBackListener.3
            @Override // java.lang.Runnable
            public void run() {
                IJsonDataListener iJsonDataListener = JsonCallBackListener.this.f15572a;
                if (iJsonDataListener != null) {
                    iJsonDataListener.onFailed(str);
                    JsonCallBackListener.this.cleanListener();
                }
            }
        });
    }

    @Override // com.tencent.could.component.common.ai.net.CallBackListener
    public void onSuccess(InputStream inputStream, boolean z4) {
        final String strInputGzipConvertToString = z4 ? inputGzipConvertToString(inputStream) : inputStreamConvertToString(inputStream);
        TxNetWorkHelper.getInstance().logDebug("JsonCallBackListener", "get finalResult string!");
        this.f15573b.post(new Runnable() { // from class: com.tencent.could.component.common.ai.net.JsonCallBackListener.1
            @Override // java.lang.Runnable
            public void run() {
                IJsonDataListener iJsonDataListener = JsonCallBackListener.this.f15572a;
                if (iJsonDataListener != null) {
                    iJsonDataListener.onSuccess(strInputGzipConvertToString);
                    JsonCallBackListener.this.cleanListener();
                }
            }
        });
    }

    @Override // com.tencent.could.component.common.ai.net.CallBackListener
    public void onSuccess(final String str) {
        this.f15573b.post(new Runnable() { // from class: com.tencent.could.component.common.ai.net.JsonCallBackListener.2
            @Override // java.lang.Runnable
            public void run() {
                IJsonDataListener iJsonDataListener = JsonCallBackListener.this.f15572a;
                if (iJsonDataListener != null) {
                    iJsonDataListener.onSuccess(str);
                    JsonCallBackListener.this.cleanListener();
                }
            }
        });
    }
}
