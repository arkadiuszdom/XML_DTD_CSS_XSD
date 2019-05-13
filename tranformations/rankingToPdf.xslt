<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <xsl:output method="xml" encoding="UTF-8"/>

    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master
                  master-name="Ranking"
                  page-height="29.7cm"
                  page-width="21.0cm"
                  margin-bottom="1cm"
                  margin-left="1cm"
                  margin-right="1cm"
                  font-family="sans-serif">
                    <fo:region-body margin-top="1cm"/>
                    <fo:region-before extent="1cm"/>
                    <fo:region-after extent="1cm"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="Ranking">
                <fo:flow flow-name="xsl-region-body">
                    <fo:table table-layout="fixed" width="100%" background-color="silver">
                        <fo:table-header>
                            <fo:table-row border="solid 3pt black" keep-together.within-page="always">
                                <fo:table-cell margin-left="3mm" display-align="center">
                                    <fo:block font-weight="bold">Pozycja</fo:block>
                                </fo:table-cell>
                                <fo:table-cell margin-left="3mm">
                                    <fo:block font-weight="bold">Nazwa</fo:block>
                                </fo:table-cell>
                                <fo:table-cell margin-left="3mm">
                                    <fo:block font-weight="bold">Gatunek</fo:block>
                                </fo:table-cell>
                                <fo:table-cell margin-left="3mm">
                                    <fo:block font-weight="bold">Ocena</fo:block>
                                </fo:table-cell>
                                <fo:table-cell margin-left="3mm">
                                    <fo:block font-weight="bold">PEGI</fo:block>
                                </fo:table-cell>
                                <fo:table-cell margin-left="3mm">
                                    <fo:block font-weight="bold">Premiera</fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-header>
                        <fo:table-body>
                            <xsl:for-each select="/Ranking/Gra">
                                <fo:table-row border="solid 3pt black" keep-together.within-page="always">
                                    <fo:table-cell margin-left="3mm" display-align="center">
                                        <fo:block>
                                            <xsl:value-of select="@Pozycja"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell margin-left="3mm" display-align="center">
                                        <fo:block>
                                            <xsl:value-of select="@Nazwa"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell margin-left="3mm" display-align="center">
                                        <fo:block>
                                            <xsl:value-of select="@Gatunek"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell margin-left="3mm" display-align="center">
                                        <fo:block>
                                            <xsl:value-of select="@Ocena"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell margin-left="3mm" display-align="center">
                                        <fo:block>
                                            <xsl:value-of select="@Zalecany_wiek_minimalny"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell margin-left="3mm" display-align="center">
                                        <fo:block>
                                            <xsl:value-of select="@Data_premiery"/>
                                        </fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                        </fo:table-body>
                    </fo:table>
                    <fo:block space-before="5mm" space-after="5mm">
                      Autorzy: Krzysztof Gonicki 210189, Arkadiusz Domrat 210166
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>

          </fo:root>
      </xsl:template>
  </xsl:stylesheet>
