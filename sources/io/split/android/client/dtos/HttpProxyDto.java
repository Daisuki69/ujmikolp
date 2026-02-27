package io.split.android.client.dtos;

import Di.a;
import Di.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import g3.InterfaceC1498b;
import io.split.android.client.network.e;
import io.split.android.client.network.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public class HttpProxyDto {

    @InterfaceC1498b("bearer_token")
    public String bearerToken;

    @InterfaceC1498b("ca_cert")
    public String caCert;

    @InterfaceC1498b("client_cert")
    public String clientCert;

    @InterfaceC1498b("client_key")
    public String clientKey;

    @InterfaceC1498b("host")
    public String host;

    @InterfaceC1498b("password")
    public String password;

    @InterfaceC1498b("port")
    public int port;

    @InterfaceC1498b("username")
    public String username;

    public HttpProxyDto() {
    }

    @NonNull
    private static StringBuilder getStringBuilder(@NonNull InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb2 = new StringBuilder();
        boolean z4 = true;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb2;
            }
            if (z4) {
                z4 = false;
            } else {
                sb2.append(Global.NEWLINE);
            }
            sb2.append(line);
        }
    }

    @Nullable
    private String streamToString(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            StringBuilder stringBuilder = getStringBuilder(inputStream);
            try {
                inputStream.reset();
            } catch (IOException unused) {
            }
            return stringBuilder.toString();
        } catch (Exception unused2) {
            return null;
        }
    }

    public HttpProxyDto(@NonNull e eVar) {
        this.host = eVar.f17583a;
        this.port = eVar.f17584b;
        k kVar = eVar.h;
        if (kVar instanceof a) {
            HttpProxyDto httpProxyDto = ((a) kVar).f1161a;
            this.username = httpProxyDto.username;
            this.password = httpProxyDto.password;
        } else if (kVar instanceof b) {
            this.bearerToken = ((b) kVar).f1162a.bearerToken;
        }
        this.clientCert = streamToString(eVar.e);
        this.clientKey = streamToString(eVar.f);
        this.caCert = streamToString(eVar.f17586g);
    }
}
