package com.tencent.could.huiyansdk.overseas;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.paymaya.R;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.ai.net.HttpMethod;
import com.tencent.could.component.common.ai.net.IJsonDataListener;
import com.tencent.could.component.common.ai.net.TXCHttp;
import com.tencent.could.component.common.ai.utils.GZipUtils;
import com.tencent.could.component.common.ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;
import com.tencent.could.huiyansdk.api.e;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthLight;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthLiveness;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.entity.LightDataRequest;
import com.tencent.could.huiyansdk.entity.LivenessRequest;
import com.tencent.could.huiyansdk.entity.OverSeaResult;
import com.tencent.could.huiyansdk.entity.ResultData;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.operate.a;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.c;
import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes4.dex */
public class HuiYanResultSender {
    public static final String TAG = "HuiYanResultSender";
    public static final int TIMEOUT_MS = 60000;
    public HuiYanOsAuthCallBack authCallBack;
    public HuiYanConfigCallback configCallback;
    public HuiYanResultCallBack resultCallBack;
    public HuiYanResultDataCallBack resultDataCallBack;

    public static final class HuiYanResultSenderHolder {
        public static final HuiYanResultSender INSTANCE = new HuiYanResultSender();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanAllCallBack() {
        if (this.resultCallBack != null) {
            this.resultCallBack = null;
        }
        if (this.configCallback != null) {
            this.configCallback = null;
        }
        j.a.f15618a.f();
    }

    public static String getBackIpUrl() {
        return "https://101.89.42.66";
    }

    public static String[] getBackIpUrls(String str) {
        String[] backUpIPs = HuiYanOsApiImp.getInstance().getOsConfig().getBackUpIPs();
        if (backUpIPs == null) {
            return null;
        }
        for (int i = 0; i < backUpIPs.length; i++) {
            backUpIPs[i] = c.a("https://" + backUpIPs[i] + str);
        }
        return backUpIPs;
    }

    public static HuiYanResultSender getInstance() {
        return HuiYanResultSenderHolder.INSTANCE;
    }

    public static void getLiveTypeErrorEvent(String str) {
        a aVar = a.b.f15709a;
        aVar.a("GetLiveTypeDateUseTime", 2, true, str);
        HuiYanOperateBody huiYanOperateBody = aVar.f15705a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.updateInfo("GetLiveTypeData", 1, 0L, System.currentTimeMillis());
        }
    }

    public static String getVerifyHost() {
        HostEntity hostEntityA = e.a();
        if (hostEntityA != null) {
            return hostEntityA.getMainHost();
        }
        getInstance().sendFailBackCall(288, c.a(R.string.hy_overseas_illegal_token_error));
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendErrorResult(int i, String str) {
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(i);
        compareResult.setErrorMsg(str);
        e.a(compareResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startHuiYanNextStep(String str) {
        Log.e(TAG, "lightData: " + str);
        HuiYanOsApi.startAuthByLightData(str, new HuiYanResultCallBack() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.2
            @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
            public void onFail(int i, String str2) {
                Log.e(HuiYanResultSender.TAG, "net work error!");
                HuiYanResultSender.this.sendAuthOnFail(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.overseas.HuiYanResultCallBack
            public void onSuccess(byte[] bArr, String str2) {
                if (bArr != null) {
                    a aVar = a.b.f15709a;
                    long length = bArr.length / 1024;
                    HuiYanOperateBody huiYanOperateBody = aVar.f15705a;
                    if (huiYanOperateBody != null) {
                        huiYanOperateBody.updateInfo("LivenessPackSize", 1, length, System.currentTimeMillis());
                    }
                }
                a aVar2 = a.b.f15709a;
                aVar2.a("LocalCheckUseTime", 2, false, "");
                String strB = c.b(str2);
                CommonUtils.deleteFileByPath(str2);
                if (TextUtils.isEmpty(strB)) {
                    e.a.f15688a.a(2, HuiYanResultSender.TAG, "videoData is empty");
                    HuiYanOperateBody huiYanOperateBody2 = aVar2.f15705a;
                    if (huiYanOperateBody2 != null) {
                        huiYanOperateBody2.updateInfo("LocalVideo", 1, 0L, System.currentTimeMillis());
                    }
                } else {
                    HuiYanOperateBody huiYanOperateBody3 = aVar2.f15705a;
                    if (huiYanOperateBody3 != null) {
                        huiYanOperateBody3.updateInfo("LocalVideo", 1, 1L, System.currentTimeMillis());
                    }
                }
                if (strB != null) {
                    long length2 = strB.getBytes().length / 1024;
                    HuiYanOperateBody huiYanOperateBody4 = aVar2.f15705a;
                    if (huiYanOperateBody4 != null) {
                        huiYanOperateBody4.updateInfo("LocalVideoSize", 1, length2, System.currentTimeMillis());
                    }
                }
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                LivenessRequest livenessRequest = new LivenessRequest();
                if (HuiYanOsApiImp.getInstance().getOsConfig().isOpenBOTCheck()) {
                    String str3 = a.C0082a.f15626a.f15623a;
                    if (!TextUtils.isEmpty(str3)) {
                        livenessRequest.setBestFrameImageFromTerminal(str3);
                        e.a.f15688a.a(1, HuiYanResultSender.TAG, "get bot image: " + str3.length() + " bytes");
                    }
                }
                livenessRequest.setLiveData(strEncodeToString);
                livenessRequest.setVideo(strB);
                livenessRequest.setNeedBestFrame(false);
                final com.google.gson.j jVar = new com.google.gson.j();
                String strK = jVar.k(livenessRequest);
                TwoTuple<String, String> twoTupleA = com.tencent.could.huiyansdk.api.e.a(false);
                if (twoTupleA == null) {
                    HuiYanResultSender.this.sendAuthOnFail(288, c.a(R.string.hy_overseas_illegal_token_error));
                    HuiYanResultSender.this.cleanAllCallBack();
                    return;
                }
                if (strK != null) {
                    long length3 = strK.getBytes().length / 1024;
                    HuiYanOperateBody huiYanOperateBody5 = aVar2.f15705a;
                    if (huiYanOperateBody5 != null) {
                        huiYanOperateBody5.updateInfo("SendPackSize", 1, length3, System.currentTimeMillis());
                    }
                }
                aVar2.a("GetCompareResultUseTime", 1, false, "");
                String strA = c.a(twoTupleA.first + "/api/v1/liveness");
                String strA2 = c.a(twoTupleA.second + "/api/v1/liveness");
                c.a(HuiYanResultSender.getBackIpUrl() + "/api/v1/liveness");
                String[] backIpUrls = HuiYanResultSender.getBackIpUrls("/api/v1/liveness");
                TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setRequestData(strK).setUrl(strA).setDeputyUrl(strA2).setRetryTimes(backIpUrls != null ? 3 + backIpUrls.length : 3).setHttpMethod(HttpMethod.POST).setTimeOutTimes(60000).setConnectTimeOut(60000).setGzip(false).createNetWorkParam(), new IJsonDataListener() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.2.1
                    @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
                    public void onFailed(String str4) {
                        com.tencent.could.huiyansdk.operate.a aVar3 = a.b.f15709a;
                        aVar3.a("GetCompareResultUseTime", 2, true, str4);
                        aVar3.a("Compare", 1, -1L, str4);
                        e.a.f15688a.a(2, HuiYanResultSender.TAG, "DO_COMPARE network error: " + str4);
                        HuiYanResultSender.this.sendErrorResult(210, c.a(R.string.hy_overseas_network_connect_error));
                        HuiYanResultSender.this.cleanAllCallBack();
                    }

                    @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
                    public void onSuccess(String str4) {
                        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
                        eVar.a(1, HuiYanResultSender.TAG, "DO_COMPARE onSuccess");
                        com.tencent.could.huiyansdk.operate.a aVar3 = a.b.f15709a;
                        aVar3.a("GetCompareResultUseTime", 2, false, "");
                        HuiYanOsAuthLiveness huiYanOsAuthLiveness = (HuiYanOsAuthLiveness) jVar.e(str4, HuiYanOsAuthLiveness.class);
                        if (huiYanOsAuthLiveness == null) {
                            eVar.a(2, HuiYanResultSender.TAG, "osAuthLiveness is null");
                            aVar3.a("Compare", 1, -1L, "osAuthLiveness is null: " + str4);
                            HuiYanResultSender.this.sendErrorResult(210, c.a(R.string.hy_overseas_network_connect_error));
                            HuiYanResultSender.this.cleanAllCallBack();
                            return;
                        }
                        if (huiYanOsAuthLiveness.getCode() != 0) {
                            aVar3.a("Compare", 1, -1L, "osAuthLiveness is code: " + huiYanOsAuthLiveness.getCode());
                            HuiYanResultSender.this.sendErrorResult(huiYanOsAuthLiveness.getCode(), c.a(R.string.hy_overseas_start_check_error_code_default));
                            return;
                        }
                        if (HuiYanResultSender.this.resultDataCallBack != null) {
                            ResultData resultData = new ResultData();
                            resultData.setResponse(str4);
                            HuiYanResultSender.this.resultDataCallBack.onSuccessResultData(resultData);
                        }
                        String resultCode = huiYanOsAuthLiveness.getData().getResultCode();
                        if ("0".equals(resultCode)) {
                            HuiYanOsAuthResult huiYanOsAuthResult = new HuiYanOsAuthResult();
                            huiYanOsAuthResult.setToken(HuiYanOsApiImp.getInstance().getCurrentToken());
                            if (HuiYanResultSender.this.authCallBack != null) {
                                HuiYanResultSender.this.authCallBack.onSuccess(huiYanOsAuthResult);
                                HuiYanResultSender.this.authCallBack = null;
                            }
                            HuiYanOperateBody huiYanOperateBody6 = aVar3.f15705a;
                            if (huiYanOperateBody6 != null) {
                                huiYanOperateBody6.updateInfo("Compare", 1, 1L, System.currentTimeMillis());
                            }
                            aVar3.a(0, "Success");
                            aVar3.b();
                            CommonUtils.closeCurrentFragment();
                        } else {
                            if (!TextUtils.isEmpty(resultCode)) {
                                eVar.a(1, HuiYanResultSender.TAG, "DO_COMPARE network error resultCode:" + resultCode);
                                aVar3.a("Compare", 1, -1L, AbstractC1414e.h("resultCode:", resultCode));
                            }
                            if ("1001".equals(resultCode) || "1004".equals(resultCode)) {
                                HuiYanResultSender.this.sendErrorResult(Integer.valueOf(resultCode).intValue(), c.a(R.string.hy_overseas_start_check_error_code_1001_1004));
                            } else {
                                HuiYanResultSender.this.sendErrorResult(Integer.valueOf(resultCode).intValue(), c.a(R.string.hy_overseas_start_check_error_code_default));
                            }
                        }
                        HuiYanResultSender.this.cleanAllCallBack();
                    }
                });
            }
        });
    }

    public void sendAuthGetLive(String str) {
        TwoTuple<String, String> twoTupleA = com.tencent.could.huiyansdk.api.e.a(false);
        if (twoTupleA == null) {
            sendAuthOnFail(288, c.a(R.string.hy_overseas_illegal_token_error));
            CommonUtils.closeCurrentFragment();
            return;
        }
        a.b.f15709a.a("GetLiveTypeDateUseTime", 1, false, "");
        String strA = c.a(twoTupleA.first + "/api/v1/light");
        String strA2 = c.a(twoTupleA.second + "/api/v1/light");
        c.a(getBackIpUrl() + "/api/v1/light");
        String[] backIpUrls = getBackIpUrls("/api/v1/light");
        int length = backIpUrls != null ? 3 + backIpUrls.length : 3;
        e.a.f15688a.a(1, TAG, "requestUrl: " + strA);
        final com.google.gson.j jVar = new com.google.gson.j();
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setRequestData(jVar.k(new LightDataRequest(str))).setUrl(strA).setDeputyUrl(strA2).setRetryTimes(length).setHttpMethod(HttpMethod.POST).setTimeOutTimes(60000).setConnectTimeOut(60000).setGzip(false).createNetWorkParam(), new IJsonDataListener() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanResultSender.1
            @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
            public void onFailed(String str2) {
                e.a.f15688a.a(2, HuiYanResultSender.TAG, "GET_LIGHT_TYPE network error: " + str2);
                HuiYanResultSender.this.sendAuthOnFail(210, c.a(R.string.hy_overseas_network_connect_error));
                HuiYanResultSender.getLiveTypeErrorEvent(str2);
                CommonUtils.closeCurrentFragment();
            }

            @Override // com.tencent.could.component.common.ai.net.IJsonDataListener
            public void onSuccess(String str2) {
                HuiYanOsAuthLight huiYanOsAuthLight = (HuiYanOsAuthLight) jVar.e(str2, HuiYanOsAuthLight.class);
                if (huiYanOsAuthLight == null) {
                    e.a.f15688a.a(2, HuiYanResultSender.TAG, "huiYanOsAuthLight is null");
                    HuiYanResultSender.this.sendAuthOnFail(210, c.a(R.string.hy_overseas_network_connect_error));
                    HuiYanResultSender.getLiveTypeErrorEvent("huiYanOsAuthLight is null");
                    CommonUtils.closeCurrentFragment();
                    return;
                }
                if (huiYanOsAuthLight.getCode() != 0) {
                    HuiYanResultSender.getLiveTypeErrorEvent(huiYanOsAuthLight.getMessage());
                    HuiYanResultSender.this.sendAuthOnFail(huiYanOsAuthLight.getCode(), huiYanOsAuthLight.getMessage());
                    CommonUtils.closeCurrentFragment();
                    return;
                }
                com.tencent.could.huiyansdk.operate.a aVar = a.b.f15709a;
                aVar.a("GetLiveTypeDateUseTime", 2, false, "");
                HuiYanOperateBody huiYanOperateBody = aVar.f15705a;
                if (huiYanOperateBody != null) {
                    huiYanOperateBody.updateInfo("GetLiveTypeData", 1, 1L, System.currentTimeMillis());
                }
                aVar.a("LocalCheckUseTime", 1, false, "");
                HuiYanResultSender.this.startHuiYanNextStep(huiYanOsAuthLight.getData().getLightData());
            }
        });
    }

    public void sendAuthOnFail(int i, String str) {
        e.a.f15688a.a(2, TAG, "send auth fail, code: " + i + " msg: " + str);
        HuiYanOsAuthCallBack huiYanOsAuthCallBack = this.authCallBack;
        if (huiYanOsAuthCallBack != null) {
            huiYanOsAuthCallBack.onFail(i, str, HuiYanOsApiImp.getInstance().getCurrentToken());
        } else {
            Log.e(TAG, "authCallBack is null!");
        }
        if (this.authCallBack != null) {
            this.authCallBack = null;
        }
        com.tencent.could.huiyansdk.operate.a aVar = a.b.f15709a;
        aVar.a(i, str);
        aVar.b();
    }

    public void sendConfigSuccess(String str) {
        if (this.configCallback != null) {
            this.configCallback.onSuccess(CommonUtils.base64EncodeToString(str));
        }
        if (this.configCallback != null) {
            this.configCallback = null;
        }
    }

    public void sendFailBackCall(int i, String str) {
        HuiYanConfigCallback huiYanConfigCallback = this.configCallback;
        if (huiYanConfigCallback != null) {
            huiYanConfigCallback.onFail(i, str);
        }
        HuiYanResultCallBack huiYanResultCallBack = this.resultCallBack;
        if (huiYanResultCallBack != null) {
            huiYanResultCallBack.onFail(i, str);
        }
        if (this.configCallback == null && this.resultCallBack == null) {
            sendAuthOnFail(i, str);
        }
        cleanAllCallBack();
    }

    public void sendResultSuccess(String str, String str2) throws Throwable {
        if (this.resultCallBack != null) {
            OverSeaResult overSeaResult = new OverSeaResult();
            overSeaResult.setValidateData(str);
            this.resultCallBack.onSuccess(GZipUtils.compress(new com.google.gson.j().k(overSeaResult)), str2);
        }
        if (HuiYanOsApiImp.getInstance().isNeedCleanListener()) {
            cleanAllCallBack();
        }
    }

    public void setAuthCallBack(HuiYanOsAuthCallBack huiYanOsAuthCallBack) {
        this.authCallBack = huiYanOsAuthCallBack;
    }

    public void setConfigCallback(HuiYanConfigCallback huiYanConfigCallback) {
        this.configCallback = huiYanConfigCallback;
    }

    public void setResultCallBack(HuiYanResultCallBack huiYanResultCallBack) {
        this.resultCallBack = huiYanResultCallBack;
        if (this.configCallback != null) {
            this.configCallback = null;
        }
    }

    public void setResultDataCallBack(HuiYanResultDataCallBack huiYanResultDataCallBack) {
        this.resultDataCallBack = huiYanResultDataCallBack;
    }
}
