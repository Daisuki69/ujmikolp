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

/* JADX INFO: loaded from: classes3.dex */
public final class BondedBluetoothDevice extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceMacAddress", schemaIndex = 1, tag = 2)
    private final String device_mac_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceName", schemaIndex = 0, tag = 1)
    private final String device_name;
    public static final C1686k Companion = new C1686k();
    public static final ProtoAdapter<BondedBluetoothDevice> ADAPTER = new C1650j(FieldEncoding.LENGTH_DELIMITED, z.a(BondedBluetoothDevice.class), "type.googleapis.com/BondedBluetoothDevice", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public BondedBluetoothDevice() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BondedBluetoothDevice copy$default(BondedBluetoothDevice bondedBluetoothDevice, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bondedBluetoothDevice.device_name;
        }
        if ((i & 2) != 0) {
            str2 = bondedBluetoothDevice.device_mac_address;
        }
        if ((i & 4) != 0) {
            byteString = bondedBluetoothDevice.unknownFields();
        }
        return bondedBluetoothDevice.copy(str, str2, byteString);
    }

    public final BondedBluetoothDevice copy(String str, String str2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new BondedBluetoothDevice(str, str2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BondedBluetoothDevice)) {
            return false;
        }
        BondedBluetoothDevice bondedBluetoothDevice = (BondedBluetoothDevice) obj;
        return j.b(unknownFields(), bondedBluetoothDevice.unknownFields()) && j.b(this.device_name, bondedBluetoothDevice.device_name) && j.b(this.device_mac_address, bondedBluetoothDevice.device_mac_address);
    }

    public final String getDevice_mac_address() {
        return this.device_mac_address;
    }

    public final String getDevice_name() {
        return this.device_name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.device_name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_mac_address;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m3newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.device_name != null) {
            AbstractC1414e.p(this.device_name, new StringBuilder("device_name="), arrayList);
        }
        if (this.device_mac_address != null) {
            AbstractC1414e.p(this.device_mac_address, new StringBuilder("device_mac_address="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "BondedBluetoothDevice{", "}", null, 56);
    }

    public /* synthetic */ BondedBluetoothDevice(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m3newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BondedBluetoothDevice(String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.device_name = str;
        this.device_mac_address = str2;
    }
}
