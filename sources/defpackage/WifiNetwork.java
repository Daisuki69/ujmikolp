package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class WifiNetwork extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ipAddress", schemaIndex = 1, tag = 2)
    private final String ip_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "macAddress", schemaIndex = 2, tag = 3)
    private final String mac_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String ssid;
    public static final L0 Companion = new L0();
    public static final ProtoAdapter<WifiNetwork> ADAPTER = new K0(FieldEncoding.LENGTH_DELIMITED, z.a(WifiNetwork.class), "type.googleapis.com/WifiNetwork", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public WifiNetwork() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WifiNetwork copy$default(WifiNetwork wifiNetwork, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifiNetwork.ssid;
        }
        if ((i & 2) != 0) {
            str2 = wifiNetwork.ip_address;
        }
        if ((i & 4) != 0) {
            str3 = wifiNetwork.mac_address;
        }
        if ((i & 8) != 0) {
            byteString = wifiNetwork.unknownFields();
        }
        return wifiNetwork.copy(str, str2, str3, byteString);
    }

    public final WifiNetwork copy(String str, String str2, String str3, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new WifiNetwork(str, str2, str3, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiNetwork)) {
            return false;
        }
        WifiNetwork wifiNetwork = (WifiNetwork) obj;
        return j.b(unknownFields(), wifiNetwork.unknownFields()) && j.b(this.ssid, wifiNetwork.ssid) && j.b(this.ip_address, wifiNetwork.ip_address) && j.b(this.mac_address, wifiNetwork.mac_address);
    }

    public final String getIp_address() {
        return this.ip_address;
    }

    public final String getMac_address() {
        return this.mac_address;
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
        String str = this.ssid;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ip_address;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.mac_address;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m37newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.ssid != null) {
            AbstractC1414e.p(this.ssid, new StringBuilder("ssid="), arrayList);
        }
        if (this.ip_address != null) {
            AbstractC1414e.p(this.ip_address, new StringBuilder("ip_address="), arrayList);
        }
        if (this.mac_address != null) {
            AbstractC1414e.p(this.mac_address, new StringBuilder("mac_address="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "WifiNetwork{", "}", null, 56);
    }

    public /* synthetic */ WifiNetwork(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m37newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiNetwork(String str, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.ssid = str;
        this.ip_address = str2;
        this.mac_address = str3;
    }
}
