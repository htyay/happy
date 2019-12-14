package com.ruoyi.project.houtai.chengyu.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 成语表 com_chengyu
 * 
 * @author ruoyi
 * @date 2019-05-03
 */
public class Chengyu extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 成语id */
	private Integer chengyuId;
	/** 成语全字 */
	private String chengyuquanzi;
	/** 全拼 */
	private String chengyuquanpin;
	/** 1是常用2中级3高级4不常用 */
	private Integer levelId;
	/** 第一个汉字 */
	private String hanziA;
	/** 第一个 */
	private String aPinyin;
	/** 第一个 */
	private Integer aShengdiao;
	/** 二位 */
	private String hanziB;
	/** 二位 */
	private String bPinyin;
	/** 二位 */
	private Integer bShengdiao;
	/** 三位 */
	private String hanziC;
	/** 三位 */
	private String cPinyin;
	/** 三位 */
	private Integer cShengdiao;
	/** 四位 */
	private String hanziD;
	/** 四位 */
	private String dPinyin;
	/** 四位 */
	private Integer dShengdiao;
	/** 五位 */
	private String hanziE;
	/** 五位 */
	private String ePinyin;
	/** 五位 */
	private Integer eShengdiao;
	/** 六位 */
	private String hanziF;
	/** 六位 */
	private String fPinyin;
	/** 六位 */
	private Integer fShengdiao;
	/** 七位 */
	private String hanziG;
	/** 七位 */
	private String gPinyin;
	/** 七位 */
	private Integer gShengdiao;
	/** 八位 */
	private String hanziH;
	/** 八位 */
	private String hPinyin;
	/** 八位 */
	private Integer hShengdiao;
	/** 九位 */
	private String hanziI;
	/** 九位 */
	private String iPinyin;
	/** 九位 */
	private Integer iShengdiao;
	/** 十位 */
	private String hanziJ;
	/** 十位 */
	private String jPinyin;
	/** 十位 */
	private Integer jShengdiao;
	/** 十一位 */
	private String hanziK;
	/** 十一位 */
	private String kPinyin;
	/** 十一位 */
	private Integer kShengdiao;
	/** 十二位 */
	private String hanziL;
	/** 十二位 */
	private String lPinyin;
	/** 十二位 */
	private Integer lShengdiao;

	public void setChengyuId(Integer chengyuId) 
	{
		this.chengyuId = chengyuId;
	}

	public Integer getChengyuId() 
	{
		return chengyuId;
	}
	public void setChengyuquanzi(String chengyuquanzi) 
	{
		this.chengyuquanzi = chengyuquanzi;
	}

	public String getChengyuquanzi() 
	{
		return chengyuquanzi;
	}
	public void setChengyuquanpin(String chengyuquanpin) 
	{
		this.chengyuquanpin = chengyuquanpin;
	}

	public String getChengyuquanpin() 
	{
		return chengyuquanpin;
	}
	public void setLevelId(Integer levelId) 
	{
		this.levelId = levelId;
	}

	public Integer getLevelId() 
	{
		return levelId;
	}
	public void setHanziA(String hanziA) 
	{
		this.hanziA = hanziA;
	}

	public String getHanziA() 
	{
		return hanziA;
	}
	public void setAPinyin(String aPinyin) 
	{
		this.aPinyin = aPinyin;
	}

	public String getAPinyin() 
	{
		return aPinyin;
	}
	public void setAShengdiao(Integer aShengdiao) 
	{
		this.aShengdiao = aShengdiao;
	}

	public Integer getAShengdiao() 
	{
		return aShengdiao;
	}
	public void setHanziB(String hanziB) 
	{
		this.hanziB = hanziB;
	}

	public String getHanziB() 
	{
		return hanziB;
	}
	public void setBPinyin(String bPinyin) 
	{
		this.bPinyin = bPinyin;
	}

	public String getBPinyin() 
	{
		return bPinyin;
	}
	public void setBShengdiao(Integer bShengdiao) 
	{
		this.bShengdiao = bShengdiao;
	}

	public Integer getBShengdiao() 
	{
		return bShengdiao;
	}
	public void setHanziC(String hanziC) 
	{
		this.hanziC = hanziC;
	}

	public String getHanziC() 
	{
		return hanziC;
	}
	public void setCPinyin(String cPinyin) 
	{
		this.cPinyin = cPinyin;
	}

	public String getCPinyin() 
	{
		return cPinyin;
	}
	public void setCShengdiao(Integer cShengdiao) 
	{
		this.cShengdiao = cShengdiao;
	}

	public Integer getCShengdiao() 
	{
		return cShengdiao;
	}
	public void setHanziD(String hanziD) 
	{
		this.hanziD = hanziD;
	}

	public String getHanziD() 
	{
		return hanziD;
	}
	public void setDPinyin(String dPinyin) 
	{
		this.dPinyin = dPinyin;
	}

	public String getDPinyin() 
	{
		return dPinyin;
	}
	public void setDShengdiao(Integer dShengdiao) 
	{
		this.dShengdiao = dShengdiao;
	}

	public Integer getDShengdiao() 
	{
		return dShengdiao;
	}
	public void setHanziE(String hanziE) 
	{
		this.hanziE = hanziE;
	}

	public String getHanziE() 
	{
		return hanziE;
	}
	public void setEPinyin(String ePinyin) 
	{
		this.ePinyin = ePinyin;
	}

	public String getEPinyin() 
	{
		return ePinyin;
	}
	public void setEShengdiao(Integer eShengdiao) 
	{
		this.eShengdiao = eShengdiao;
	}

	public Integer getEShengdiao() 
	{
		return eShengdiao;
	}
	public void setHanziF(String hanziF) 
	{
		this.hanziF = hanziF;
	}

	public String getHanziF() 
	{
		return hanziF;
	}
	public void setFPinyin(String fPinyin) 
	{
		this.fPinyin = fPinyin;
	}

	public String getFPinyin() 
	{
		return fPinyin;
	}
	public void setFShengdiao(Integer fShengdiao) 
	{
		this.fShengdiao = fShengdiao;
	}

	public Integer getFShengdiao() 
	{
		return fShengdiao;
	}
	public void setHanziG(String hanziG) 
	{
		this.hanziG = hanziG;
	}

	public String getHanziG() 
	{
		return hanziG;
	}
	public void setGPinyin(String gPinyin) 
	{
		this.gPinyin = gPinyin;
	}

	public String getGPinyin() 
	{
		return gPinyin;
	}
	public void setGShengdiao(Integer gShengdiao) 
	{
		this.gShengdiao = gShengdiao;
	}

	public Integer getGShengdiao() 
	{
		return gShengdiao;
	}
	public void setHanziH(String hanziH) 
	{
		this.hanziH = hanziH;
	}

	public String getHanziH() 
	{
		return hanziH;
	}
	public void setHPinyin(String hPinyin) 
	{
		this.hPinyin = hPinyin;
	}

	public String getHPinyin() 
	{
		return hPinyin;
	}
	public void setHShengdiao(Integer hShengdiao) 
	{
		this.hShengdiao = hShengdiao;
	}

	public Integer getHShengdiao() 
	{
		return hShengdiao;
	}
	public void setHanziI(String hanziI) 
	{
		this.hanziI = hanziI;
	}

	public String getHanziI() 
	{
		return hanziI;
	}
	public void setIPinyin(String iPinyin) 
	{
		this.iPinyin = iPinyin;
	}

	public String getIPinyin() 
	{
		return iPinyin;
	}
	public void setIShengdiao(Integer iShengdiao) 
	{
		this.iShengdiao = iShengdiao;
	}

	public Integer getIShengdiao() 
	{
		return iShengdiao;
	}
	public void setHanziJ(String hanziJ) 
	{
		this.hanziJ = hanziJ;
	}

	public String getHanziJ() 
	{
		return hanziJ;
	}
	public void setJPinyin(String jPinyin) 
	{
		this.jPinyin = jPinyin;
	}

	public String getJPinyin() 
	{
		return jPinyin;
	}
	public void setJShengdiao(Integer jShengdiao) 
	{
		this.jShengdiao = jShengdiao;
	}

	public Integer getJShengdiao() 
	{
		return jShengdiao;
	}
	public void setHanziK(String hanziK) 
	{
		this.hanziK = hanziK;
	}

	public String getHanziK() 
	{
		return hanziK;
	}
	public void setKPinyin(String kPinyin) 
	{
		this.kPinyin = kPinyin;
	}

	public String getKPinyin() 
	{
		return kPinyin;
	}
	public void setKShengdiao(Integer kShengdiao) 
	{
		this.kShengdiao = kShengdiao;
	}

	public Integer getKShengdiao() 
	{
		return kShengdiao;
	}
	public void setHanziL(String hanziL) 
	{
		this.hanziL = hanziL;
	}

	public String getHanziL() 
	{
		return hanziL;
	}
	public void setLPinyin(String lPinyin) 
	{
		this.lPinyin = lPinyin;
	}

	public String getLPinyin() 
	{
		return lPinyin;
	}
	public void setLShengdiao(Integer lShengdiao) 
	{
		this.lShengdiao = lShengdiao;
	}

	public Integer getLShengdiao() 
	{
		return lShengdiao;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chengyuId", getChengyuId())
            .append("chengyuquanzi", getChengyuquanzi())
            .append("chengyuquanpin", getChengyuquanpin())
            .append("levelId", getLevelId())
            .append("hanziA", getHanziA())
            .append("aPinyin", getAPinyin())
            .append("aShengdiao", getAShengdiao())
            .append("hanziB", getHanziB())
            .append("bPinyin", getBPinyin())
            .append("bShengdiao", getBShengdiao())
            .append("hanziC", getHanziC())
            .append("cPinyin", getCPinyin())
            .append("cShengdiao", getCShengdiao())
            .append("hanziD", getHanziD())
            .append("dPinyin", getDPinyin())
            .append("dShengdiao", getDShengdiao())
            .append("hanziE", getHanziE())
            .append("ePinyin", getEPinyin())
            .append("eShengdiao", getEShengdiao())
            .append("hanziF", getHanziF())
            .append("fPinyin", getFPinyin())
            .append("fShengdiao", getFShengdiao())
            .append("hanziG", getHanziG())
            .append("gPinyin", getGPinyin())
            .append("gShengdiao", getGShengdiao())
            .append("hanziH", getHanziH())
            .append("hPinyin", getHPinyin())
            .append("hShengdiao", getHShengdiao())
            .append("hanziI", getHanziI())
            .append("iPinyin", getIPinyin())
            .append("iShengdiao", getIShengdiao())
            .append("hanziJ", getHanziJ())
            .append("jPinyin", getJPinyin())
            .append("jShengdiao", getJShengdiao())
            .append("hanziK", getHanziK())
            .append("kPinyin", getKPinyin())
            .append("kShengdiao", getKShengdiao())
            .append("hanziL", getHanziL())
            .append("lPinyin", getLPinyin())
            .append("lShengdiao", getLShengdiao())
            .toString();
    }
}
