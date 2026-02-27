package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.C1381e;
import dg.C1382f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class BondedDevice extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String macAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String name;
    public static final C1382f Companion = new C1382f();
    public static final ProtoAdapter<BondedDevice> ADAPTER = new C1381e(FieldEncoding.LENGTH_DELIMITED, z.a(BondedDevice.class), "type.googleapis.com/dde.protobuf.fragments.BondedDevice", Syntax.PROTO_3, null, "dde-protobuf/fragments/BondedDevice.proto");

    public BondedDevice() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BondedDevice copy$default(BondedDevice bondedDevice, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bondedDevice.name;
        }
        if ((i & 2) != 0) {
            str2 = bondedDevice.macAddress;
        }
        if ((i & 4) != 0) {
            byteString = bondedDevice.unknownFields();
        }
        return bondedDevice.copy(str, str2, byteString);
    }

    public final BondedDevice copy(String str, String str2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new BondedDevice(str, str2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BondedDevice)) {
            return false;
        }
        BondedDevice bondedDevice = (BondedDevice) obj;
        return j.b(unknownFields(), bondedDevice.unknownFields()) && j.b(this.name, bondedDevice.name) && j.b(this.macAddress, bondedDevice.macAddress);
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.macAddress;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m228newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.name != null) {
            AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        }
        if (this.macAddress != null) {
            AbstractC1414e.p(this.macAddress, new StringBuilder("macAddress="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "BondedDevice{", "}", null, 56);
    }

    public /* synthetic */ BondedDevice(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m228newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BondedDevice(String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.name = str;
        this.macAddress = str2;
    }
}
