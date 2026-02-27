package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.V;
import dg.W;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class RiskIntelligenceFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    private final Boolean isBiometricsEnrolled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    private final Boolean isBluetoothOn;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    private final Boolean isDataRoamingEnabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean isDebuggerAttached;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    private final Boolean isDeveloperModeEnabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    private final Boolean isLocationEnabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    private final Boolean isRooted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    private final Boolean isSystemUser;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
    private final Boolean isUsbDebuggingEnabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 11)
    private final Boolean isVirtual;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 11, tag = 12)
    private final Boolean isVpnConnected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 12, tag = 13)
    private final Boolean isWifiDebuggingEnabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 13, tag = 14)
    private final Boolean isWifiEnabled;
    public static final W Companion = new W();
    public static final ProtoAdapter<RiskIntelligenceFragment> ADAPTER = new V(FieldEncoding.LENGTH_DELIMITED, z.a(RiskIntelligenceFragment.class), "type.googleapis.com/dde.protobuf.fragments.RiskIntelligenceFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/RiskIntelligenceFragment.proto");

    public RiskIntelligenceFragment() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final RiskIntelligenceFragment copy(ExtractionDetails extractionDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new RiskIntelligenceFragment(extractionDetails, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskIntelligenceFragment)) {
            return false;
        }
        RiskIntelligenceFragment riskIntelligenceFragment = (RiskIntelligenceFragment) obj;
        return j.b(unknownFields(), riskIntelligenceFragment.unknownFields()) && j.b(this.extractionDetails, riskIntelligenceFragment.extractionDetails) && j.b(this.isBluetoothOn, riskIntelligenceFragment.isBluetoothOn) && j.b(this.isDebuggerAttached, riskIntelligenceFragment.isDebuggerAttached) && j.b(this.isDeveloperModeEnabled, riskIntelligenceFragment.isDeveloperModeEnabled) && j.b(this.isBiometricsEnrolled, riskIntelligenceFragment.isBiometricsEnrolled) && j.b(this.isLocationEnabled, riskIntelligenceFragment.isLocationEnabled) && j.b(this.isDataRoamingEnabled, riskIntelligenceFragment.isDataRoamingEnabled) && j.b(this.isRooted, riskIntelligenceFragment.isRooted) && j.b(this.isSystemUser, riskIntelligenceFragment.isSystemUser) && j.b(this.isUsbDebuggingEnabled, riskIntelligenceFragment.isUsbDebuggingEnabled) && j.b(this.isVirtual, riskIntelligenceFragment.isVirtual) && j.b(this.isVpnConnected, riskIntelligenceFragment.isVpnConnected) && j.b(this.isWifiDebuggingEnabled, riskIntelligenceFragment.isWifiDebuggingEnabled) && j.b(this.isWifiEnabled, riskIntelligenceFragment.isWifiEnabled);
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37;
        Boolean bool = this.isBluetoothOn;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.isDebuggerAttached;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.isDeveloperModeEnabled;
        int iHashCode5 = (iHashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.isBiometricsEnrolled;
        int iHashCode6 = (iHashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.isLocationEnabled;
        int iHashCode7 = (iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.isDataRoamingEnabled;
        int iHashCode8 = (iHashCode7 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.isRooted;
        int iHashCode9 = (iHashCode8 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.isSystemUser;
        int iHashCode10 = (iHashCode9 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Boolean bool9 = this.isUsbDebuggingEnabled;
        int iHashCode11 = (iHashCode10 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.isVirtual;
        int iHashCode12 = (iHashCode11 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        Boolean bool11 = this.isVpnConnected;
        int iHashCode13 = (iHashCode12 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.isWifiDebuggingEnabled;
        int iHashCode14 = (iHashCode13 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        Boolean bool13 = this.isWifiEnabled;
        int iHashCode15 = iHashCode14 + (bool13 != null ? bool13.hashCode() : 0);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    public final Boolean isBiometricsEnrolled() {
        return this.isBiometricsEnrolled;
    }

    public final Boolean isBluetoothOn() {
        return this.isBluetoothOn;
    }

    public final Boolean isDataRoamingEnabled() {
        return this.isDataRoamingEnabled;
    }

    public final Boolean isDebuggerAttached() {
        return this.isDebuggerAttached;
    }

    public final Boolean isDeveloperModeEnabled() {
        return this.isDeveloperModeEnabled;
    }

    public final Boolean isLocationEnabled() {
        return this.isLocationEnabled;
    }

    public final Boolean isRooted() {
        return this.isRooted;
    }

    public final Boolean isSystemUser() {
        return this.isSystemUser;
    }

    public final Boolean isUsbDebuggingEnabled() {
        return this.isUsbDebuggingEnabled;
    }

    public final Boolean isVirtual() {
        return this.isVirtual;
    }

    public final Boolean isVpnConnected() {
        return this.isVpnConnected;
    }

    public final Boolean isWifiDebuggingEnabled() {
        return this.isWifiDebuggingEnabled;
    }

    public final Boolean isWifiEnabled() {
        return this.isWifiEnabled;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m249newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (this.isBluetoothOn != null) {
            AbstractC1414e.q(new StringBuilder("isBluetoothOn="), this.isBluetoothOn, arrayList);
        }
        if (this.isDebuggerAttached != null) {
            AbstractC1414e.q(new StringBuilder("isDebuggerAttached="), this.isDebuggerAttached, arrayList);
        }
        if (this.isDeveloperModeEnabled != null) {
            AbstractC1414e.q(new StringBuilder("isDeveloperModeEnabled="), this.isDeveloperModeEnabled, arrayList);
        }
        if (this.isBiometricsEnrolled != null) {
            AbstractC1414e.q(new StringBuilder("isBiometricsEnrolled="), this.isBiometricsEnrolled, arrayList);
        }
        if (this.isLocationEnabled != null) {
            AbstractC1414e.q(new StringBuilder("isLocationEnabled="), this.isLocationEnabled, arrayList);
        }
        if (this.isDataRoamingEnabled != null) {
            AbstractC1414e.q(new StringBuilder("isDataRoamingEnabled="), this.isDataRoamingEnabled, arrayList);
        }
        if (this.isRooted != null) {
            AbstractC1414e.q(new StringBuilder("isRooted="), this.isRooted, arrayList);
        }
        if (this.isSystemUser != null) {
            AbstractC1414e.q(new StringBuilder("isSystemUser="), this.isSystemUser, arrayList);
        }
        if (this.isUsbDebuggingEnabled != null) {
            AbstractC1414e.q(new StringBuilder("isUsbDebuggingEnabled="), this.isUsbDebuggingEnabled, arrayList);
        }
        if (this.isVirtual != null) {
            AbstractC1414e.q(new StringBuilder("isVirtual="), this.isVirtual, arrayList);
        }
        if (this.isVpnConnected != null) {
            AbstractC1414e.q(new StringBuilder("isVpnConnected="), this.isVpnConnected, arrayList);
        }
        if (this.isWifiDebuggingEnabled != null) {
            AbstractC1414e.q(new StringBuilder("isWifiDebuggingEnabled="), this.isWifiDebuggingEnabled, arrayList);
        }
        if (this.isWifiEnabled != null) {
            AbstractC1414e.q(new StringBuilder("isWifiEnabled="), this.isWifiEnabled, arrayList);
        }
        return C1110A.F(arrayList, ", ", "RiskIntelligenceFragment{", "}", null, 56);
    }

    public /* synthetic */ RiskIntelligenceFragment(ExtractionDetails extractionDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6, (i & 128) != 0 ? null : bool7, (i & 256) != 0 ? null : bool8, (i & 512) != 0 ? null : bool9, (i & 1024) != 0 ? null : bool10, (i & 2048) != 0 ? null : bool11, (i & 4096) != 0 ? null : bool12, (i & 8192) == 0 ? bool13 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m249newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskIntelligenceFragment(ExtractionDetails extractionDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.isBluetoothOn = bool;
        this.isDebuggerAttached = bool2;
        this.isDeveloperModeEnabled = bool3;
        this.isBiometricsEnrolled = bool4;
        this.isLocationEnabled = bool5;
        this.isDataRoamingEnabled = bool6;
        this.isRooted = bool7;
        this.isSystemUser = bool8;
        this.isUsbDebuggingEnabled = bool9;
        this.isVirtual = bool10;
        this.isVpnConnected = bool11;
        this.isWifiDebuggingEnabled = bool12;
        this.isWifiEnabled = bool13;
    }
}
