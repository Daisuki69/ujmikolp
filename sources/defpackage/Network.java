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
public final class Network extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkCarrierIso", schemaIndex = 2, tag = 3)
    private final String network_carrier_iso;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkOperatorName", schemaIndex = 1, tag = 2)
    private final String network_operator_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkType", schemaIndex = 0, tag = 1)
    private final String network_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "signalStrength", schemaIndex = 3, tag = 4)
    private final String signal_strength;
    public static final m0 Companion = new m0();
    public static final ProtoAdapter<Network> ADAPTER = new C1795l0(FieldEncoding.LENGTH_DELIMITED, z.a(Network.class), "type.googleapis.com/Network", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Network() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Network copy$default(Network network, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = network.network_type;
        }
        if ((i & 2) != 0) {
            str2 = network.network_operator_name;
        }
        if ((i & 4) != 0) {
            str3 = network.network_carrier_iso;
        }
        if ((i & 8) != 0) {
            str4 = network.signal_strength;
        }
        if ((i & 16) != 0) {
            byteString = network.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return network.copy(str, str2, str5, str4, byteString2);
    }

    public final Network copy(String str, String str2, String str3, String str4, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Network(str, str2, str3, str4, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return j.b(unknownFields(), network.unknownFields()) && j.b(this.network_type, network.network_type) && j.b(this.network_operator_name, network.network_operator_name) && j.b(this.network_carrier_iso, network.network_carrier_iso) && j.b(this.signal_strength, network.signal_strength);
    }

    public final String getNetwork_carrier_iso() {
        return this.network_carrier_iso;
    }

    public final String getNetwork_operator_name() {
        return this.network_operator_name;
    }

    public final String getNetwork_type() {
        return this.network_type;
    }

    public final String getSignal_strength() {
        return this.signal_strength;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.network_type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.network_operator_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.network_carrier_iso;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.signal_strength;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.network_type != null) {
            AbstractC1414e.p(this.network_type, new StringBuilder("network_type="), arrayList);
        }
        if (this.network_operator_name != null) {
            AbstractC1414e.p(this.network_operator_name, new StringBuilder("network_operator_name="), arrayList);
        }
        if (this.network_carrier_iso != null) {
            AbstractC1414e.p(this.network_carrier_iso, new StringBuilder("network_carrier_iso="), arrayList);
        }
        if (this.signal_strength != null) {
            AbstractC1414e.p(this.signal_strength, new StringBuilder("signal_strength="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Network{", "}", null, 56);
    }

    public /* synthetic */ Network(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Network(String str, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.network_type = str;
        this.network_operator_name = str2;
        this.network_carrier_iso = str3;
        this.signal_strength = str4;
    }
}
