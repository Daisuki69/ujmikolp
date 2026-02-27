package com.dynatrace.agent.communication.network.request;

import com.dynatrace.agent.communication.network.CompressionToolkitKt;
import com.dynatrace.agent.communication.network.datasource.DataRequest;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class DataRequestFactory {
    private final Function0<Long> timestampProvider;
    private final boolean useCompression;
    private final String version;

    public DataRequestFactory(String version, Function0<Long> timestampProvider, boolean z4) {
        j.g(version, "version");
        j.g(timestampProvider, "timestampProvider");
        this.version = version;
        this.timestampProvider = timestampProvider;
        this.useCompression = z4;
    }

    public final Request createRequest(DataRequest dataRequest) throws IOException {
        byte[] bArrL;
        MediaType mediaType;
        Compression compression;
        j.g(dataRequest, "dataRequest");
        if (this.useCompression) {
            bArrL = CompressionToolkitKt.gzipDeflate(dataRequest.getBody());
            mediaType = MediaType.Companion.get("application/octet-stream");
            compression = Compression.GZIP;
        } else {
            bArrL = z.l(dataRequest.getBody());
            mediaType = MediaType.Companion.get("application/json;charset=UTF-8");
            compression = Compression.UNCOMPRESSED;
        }
        byte[] bArr = bArrL;
        MediaType mediaType2 = mediaType;
        Headers.Builder builderAdd = new Headers.Builder().add("accept-encoding", "gzip");
        return new Request.Builder().post(RequestBody.Companion.create$default(RequestBody.Companion, bArr, mediaType2, 0, 0, 6, (Object) null)).headers(builderAdd.build()).url(HttpUrlExtensionsKt.buildWithQueryChecksum(HttpUrlExtensionsKt.addServerIdParameter(HttpUrlExtensionsKt.addRetryQueryParameters(HttpUrlExtensionsKt.addBodyQueryParameters(HttpUrlExtensionsKt.addBaseQueryParameters(HttpUrl.Companion.get(dataRequest.getEndPointInfo().getUrl()).newBuilder(), dataRequest.getEndPointInfo(), this.version, dataRequest.getServerData().getConfig().getRevision()), bArr, compression, dataRequest.isPriority() ? "high" : null, this.timestampProvider), dataRequest.getRetryInfo()), dataRequest.getServerId()))).build();
    }

    public /* synthetic */ DataRequestFactory(String str, Function0 function0, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i & 4) != 0 ? true : z4);
    }
}
