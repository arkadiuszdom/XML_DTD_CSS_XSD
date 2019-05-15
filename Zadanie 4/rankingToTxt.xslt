<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="text" version="1.0" encoding="UTF-8" indent="yes"/>

  <xsl:template match="/">
    <xsl:text>|</xsl:text>
    <xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadGenre"/>
    <xsl:text>           |</xsl:text>
    <xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadSummedRating"/>
    <xsl:text> |</xsl:text>
    <xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadTitles"/>
    <xsl:text>&#xA;</xsl:text>

    <xsl:for-each select="rankingGenreSummary/positionsTable/positionsTableDataRow">
      <xsl:variable name="genre" select='positionsTableDataGenre'/>
      <xsl:variable name="summedRating" select='positionsTableDataSummedRating'/>
      <xsl:variable name="game" select='positionsTableDataTitles/positionsTableDataTitle'/>
      <xsl:value-of select="concat('|',$genre, substring('               |', string-length($genre)))"/>
      <xsl:value-of select="concat(substring($summedRating, 0, 5), substring('             |', string-length(substring($summedRating, 0, 5))))"/>
      <xsl:value-of select="$game"/>
      <xsl:text>&#xA;</xsl:text>
    </xsl:for-each>
    <xsl:text>&#xA;</xsl:text>

    <xsl:text>Statistics</xsl:text>
    <xsl:text>&#xA;</xsl:text>

    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadNGenres'/>
    <xsl:text>: </xsl:text>
    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataNGeneres'/>
    <xsl:text>&#xA;</xsl:text>

    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadNPositions'/>
    <xsl:text>: </xsl:text>
    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataNPositions'/>
    <xsl:text>&#xA;</xsl:text>

    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadTotal'/>
    <xsl:text>: </xsl:text>
    <xsl:value-of select='substring(rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataTotal, 0, 4)'/>
    <xsl:text>&#xA;</xsl:text>

    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadDate'/>
    <xsl:text>: </xsl:text>
    <xsl:value-of select='rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataDate'/>
    <xsl:text>&#xA;</xsl:text>

    <xsl:text>&#xA;</xsl:text>
    <xsl:text>Autorzy: Krzysztof Gonicki 210189, Arkadiusz Domrat 210166</xsl:text>
  </xsl:template>
</xsl:stylesheet>
