<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" version="1.0" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <xsl:text>|Pozycja |Nazwa                           |Gatunek     |Ocena |PEGI |Data premiery |</xsl:text>
        <xsl:text>&#xA;</xsl:text>
        <xsl:text>|++++++++|++++++++++++++++++++++++++++++++|++++++++++++|++++++|+++++|++++++++++++++|</xsl:text>
        <xsl:text>&#xA;</xsl:text>

        <xsl:for-each select="Ranking/Gra">
            <xsl:value-of
                    select="concat('|',
                      @Pozycja, substring('       |', string-length(@Pozycja)),
                      @Nazwa, substring('                               |', string-length(@Nazwa)),
                      @Gatunek, substring('           |', string-length(@Gatunek)),
                      @Ocena, substring('     |', string-length(@Ocena)),
                      @Zalecany_wiek_minimalny, substring('    |', string-length(@Zalecany_wiek_minimalny)),
                      @Data_premiery, '    |'
                    )"/>
            <xsl:text>&#xA;</xsl:text>
        </xsl:for-each>

        <xsl:text>&#xA;</xsl:text>
        <xsl:text>Autorzy: Krzysztof Gonicki 210189, Arkadiusz Domrat 210166</xsl:text>
    </xsl:template>
</xsl:stylesheet>
