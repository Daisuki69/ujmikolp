package com.dynatrace.agent.communication.network.request;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.storage.db.EndPointInfo;
import java.util.zip.CRC32;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import okhttp3.HttpUrl;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpUrlExtensionsKt {
    private static final String BEACON_TYPE = "mb";
    private static final String CONTENT_TYPE = "event";
    private static final String PROTOCOL_VERSION = "4";
    private static final String TECHNOLOGY_TYPE = "android";

    public static final HttpUrl.Builder addBaseQueryParameters(HttpUrl.Builder builder, EndPointInfo endPointInfo, String version, long j) {
        j.g(builder, "<this>");
        j.g(endPointInfo, "endPointInfo");
        j.g(version, "version");
        builder.addQueryParameter("ty", BEACON_TYPE);
        builder.addQueryParameter("pv", PROTOCOL_VERSION);
        builder.addQueryParameter(TtmlNode.TAG_TT, "android");
        builder.addQueryParameter(CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, version);
        builder.addQueryParameter("ai", endPointInfo.getApplicationId());
        builder.addQueryParameter("cr", String.valueOf(j));
        return builder;
    }

    public static final HttpUrl.Builder addBodyQueryParameters(HttpUrl.Builder builder, byte[] body, Compression compression, String str, Function0<Long> timeStampGenerator) {
        j.g(builder, "<this>");
        j.g(body, "body");
        j.g(compression, "compression");
        j.g(timeStampGenerator, "timeStampGenerator");
        builder.addQueryParameter("cy", "event");
        if (str != null) {
            builder.addQueryParameter(CmcdConfiguration.KEY_PLAYBACK_RATE, str);
        }
        builder.addQueryParameter("bc", generateCrcChecksum(body));
        if (compression != Compression.UNCOMPRESSED) {
            builder.addQueryParameter("co", compression.getDescription());
        }
        builder.addQueryParameter(CmcdConfiguration.KEY_STREAM_TYPE, String.valueOf(((Number) timeStampGenerator.invoke()).longValue()));
        return builder;
    }

    public static final HttpUrl.Builder addRetryQueryParameters(HttpUrl.Builder builder, RetryInfo retryInfo) {
        j.g(builder, "<this>");
        if (retryInfo != null) {
            builder.addQueryParameter("rc", String.valueOf(retryInfo.getCount()));
            if (retryInfo.getReason() != null) {
                builder.addQueryParameter("rr", retryInfo.getReason());
            }
        }
        return builder;
    }

    public static /* synthetic */ HttpUrl.Builder addRetryQueryParameters$default(HttpUrl.Builder builder, RetryInfo retryInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            retryInfo = null;
        }
        return addRetryQueryParameters(builder, retryInfo);
    }

    public static final HttpUrl.Builder addServerIdParameter(HttpUrl.Builder builder, Integer num) {
        j.g(builder, "<this>");
        if (num != null) {
            builder.addQueryParameter("si", String.valueOf(num.intValue()));
        }
        return builder;
    }

    public static /* synthetic */ HttpUrl.Builder addServerIdParameter$default(HttpUrl.Builder builder, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return addServerIdParameter(builder, num);
    }

    public static final HttpUrl buildWithQueryChecksum(HttpUrl.Builder builder) {
        j.g(builder, "<this>");
        HttpUrl httpUrlBuild = builder.build();
        String strEncodedQuery = httpUrlBuild.encodedQuery();
        return httpUrlBuild.newBuilder().addQueryParameter("qc", strEncodedQuery != null ? generateCrcChecksum(z.l(strEncodedQuery)) : null).addQueryParameter(TtmlNode.END, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).build();
    }

    public static final String generateCrcChecksum(byte[] bArr) {
        j.g(bArr, "<this>");
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return String.valueOf(crc32.getValue());
    }
}
