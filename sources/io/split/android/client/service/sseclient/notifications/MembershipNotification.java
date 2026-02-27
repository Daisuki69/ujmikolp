package io.split.android.client.service.sseclient.notifications;

import ai.EnumC0712a;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import g3.InterfaceC1498b;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class MembershipNotification extends IncomingNotification {

    @InterfaceC1498b(CmcdData.Factory.STREAMING_FORMAT_SS)
    private Integer algorithmSeed;

    @InterfaceC1498b("cn")
    private Long changeNumber;

    @InterfaceC1498b("c")
    private EnumC0712a compression;

    @InterfaceC1498b("d")
    private String data;

    @InterfaceC1498b(CmcdData.Factory.STREAMING_FORMAT_HLS)
    private HashingAlgorithm hashingAlgorithm;

    @InterfaceC1498b("n")
    private Set<String> names;

    @InterfaceC1498b(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)
    private Long updateIntervalMs;

    @InterfaceC1498b("u")
    private MySegmentUpdateStrategy updateStrategy;

    @Nullable
    public Integer getAlgorithmSeed() {
        return this.algorithmSeed;
    }

    @Nullable
    public Long getChangeNumber() {
        return this.changeNumber;
    }

    @Nullable
    public EnumC0712a getCompression() {
        return this.compression;
    }

    @Nullable
    public String getData() {
        return this.data;
    }

    @Nullable
    public HashingAlgorithm getHashingAlgorithm() {
        return this.hashingAlgorithm;
    }

    @Nullable
    public Set<String> getNames() {
        return this.names;
    }

    @Nullable
    public Long getUpdateIntervalMs() {
        return this.updateIntervalMs;
    }

    @Nullable
    public MySegmentUpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }
}
