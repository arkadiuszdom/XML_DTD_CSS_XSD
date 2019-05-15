<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="3.0">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="Ranking" page-height="21cm" page-width="29.7cm" font-family="sans-serif">
					<fo:region-body region-name="only_region" margin="2cm"/>
				</fo:simple-page-master>
			</fo:layout-master-set>

			<fo:page-sequence master-reference="Ranking">
				<fo:flow flow-name="only_region">
					<fo:block font-style="italic">
						DATA:
					</fo:block>
					<fo:table border="solid 2pt black" background-color="#ffffcc">
						<fo:table-header>
							<fo:table-row>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadGenre"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadTitles"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadSummedRating"/>
									</fo:block>
								</fo:table-cell>
							</fo:table-row>
						</fo:table-header>
						<fo:table-body>
							<xsl:for-each select="rankingGenreSummary/positionsTable/positionsTableDataRow">
								<xsl:variable name="genre" select="positionsTableDataGenre"/>
								<xsl:variable name="summedRating" select="positionsTableDataSummedRating"/>
								<xsl:variable name="game" select="positionsTableDataTitles"/>
								<xsl:value-of select="$genre"/>
								<xsl:value-of select="$summedRating"/>
								<xsl:value-of select="$game"/>
								<fo:table-row>
									<fo:table-cell border="solid 1pt black">
										<fo:block>
											<xsl:value-of select="$genre"/>
										</fo:block>
									</fo:table-cell>
									<fo:table-cell border="solid 1pt black">
										<fo:block>
											<xsl:value-of select="$game"/>
										</fo:block>
									</fo:table-cell>
									<fo:table-cell border="solid 1pt black">
										<fo:block>
											<xsl:value-of select="substring($summedRating, 0, 5)"/>
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
							</xsl:for-each>
						</fo:table-body>
					</fo:table>

					<fo:block font-style="italic">
						STATISTICS:
					</fo:block>
					<fo:table border="solid 2pt black" background-color="#ccffff">
						<fo:table-header>
							<fo:table-row>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadNGenres"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadNPositions"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadTotal"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block font-weight="bold">
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadDate"/>
									</fo:block>
								</fo:table-cell>
							</fo:table-row>
						</fo:table-header>
						<fo:table-body>
							<fo:table-row>
								<fo:table-cell border="solid 1pt black">
									<fo:block>
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataNGeneres"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block>
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataNPositions"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block>
										<xsl:value-of select="substring(rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataTotal, 0, 4)"/>
									</fo:block>
								</fo:table-cell>
								<fo:table-cell border="solid 1pt black">
									<fo:block>
										<xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataDate"/>
									</fo:block>
								</fo:table-cell>
							</fo:table-row>
						</fo:table-body>
					</fo:table>
					<fo:block color="grey">
						Autorzy: Krzysztof Gonicki 210189, Arkadiusz Domrat 210166
					</fo:block>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>

</xsl:stylesheet>
