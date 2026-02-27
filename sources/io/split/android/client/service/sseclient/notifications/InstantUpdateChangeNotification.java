package io.split.android.client.service.sseclient.notifications;

import ai.EnumC0712a;
import androidx.annotation.Nullable;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InstantUpdateChangeNotification extends IncomingNotification {

    @InterfaceC1498b("changeNumber")
    private long changeNumber;

    @Nullable
    @InterfaceC1498b("c")
    private Integer compressionType;

    @Nullable
    @InterfaceC1498b("d")
    private String data;

    @Nullable
    @InterfaceC1498b("pcn")
    private Long previousChangeNumber;

    public InstantUpdateChangeNotification() {
    }

    public long getChangeNumber() {
        return this.changeNumber;
    }

    @Nullable
    public EnumC0712a getCompressionType() {
        Integer num = this.compressionType;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            return EnumC0712a.f7235a;
        }
        if (this.compressionType.intValue() == 1) {
            return EnumC0712a.f7236b;
        }
        if (this.compressionType.intValue() == 2) {
            return EnumC0712a.c;
        }
        return null;
    }

    @Nullable
    public String getData() {
        return this.data;
    }

    @Nullable
    public Long getPreviousChangeNumber() {
        return this.previousChangeNumber;
    }

    public InstantUpdateChangeNotification(long j) {
        this.changeNumber = j;
    }
}
