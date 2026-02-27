package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.f0;
import dg.g0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Wifi extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String ipAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String macAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String ssid;
    public static final g0 Companion = new g0();
    public static final ProtoAdapter<Wifi> ADAPTER = new f0(FieldEncoding.LENGTH_DELIMITED, z.a(Wifi.class), "type.googleapis.com/dde.protobuf.fragments.Wifi", Syntax.PROTO_3, null, "dde-protobuf/fragments/Wifi.proto");

    public Wifi() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Wifi copy$default(Wifi wifi, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifi.macAddress;
        }
        if ((i & 2) != 0) {
            str2 = wifi.ipAddress;
        }
        if ((i & 4) != 0) {
            str3 = wifi.ssid;
        }
        if ((i & 8) != 0) {
            byteString = wifi.unknownFields();
        }
        return wifi.copy(str, str2, str3, byteString);
    }

    public final Wifi copy(String str, String str2, String str3, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Wifi(str, str2, str3, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Wifi)) {
            return false;
        }
        Wifi wifi = (Wifi) obj;
        return j.b(unknownFields(), wifi.unknownFields()) && j.b(this.macAddress, wifi.macAddress) && j.b(this.ipAddress, wifi.ipAddress) && j.b(this.ssid, wifi.ssid);
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.macAddress;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ipAddress;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.ssid;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m254newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.macAddress != null) {
            AbstractC1414e.p(this.macAddress, new StringBuilder("macAddress="), arrayList);
        }
        if (this.ipAddress != null) {
            AbstractC1414e.p(this.ipAddress, new StringBuilder("ipAddress="), arrayList);
        }
        if (this.ssid != null) {
            AbstractC1414e.p(this.ssid, new StringBuilder("ssid="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Wifi{", "}", null, 56);
    }

    public /* synthetic */ Wifi(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m254newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wifi(String str, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.macAddress = str;
        this.ipAddress = str2;
        this.ssid = str3;
    }
}
