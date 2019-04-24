<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
			<head>
 				<title>Ranking Genre Summary</title>
			</head>
			<body>
				<p><img width="76" height="120" alt="Logo Politechniki Łódzkiej" src="https://ftims.edu.p.lodz.pl/pluginfile.php/1/theme_adaptable/adaptablemarketingimages/0/logotype.png"/></p>
				<p><a href="#reportTable">Report</a></p>
				<h2 id="positionsTable">Genres</h2>
				<table>
					<tr>
						<th><xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadGenre"/></th>
						<th><xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadTitles"/></th>
						<th><xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadSummedRating"/></th>						
					</tr>

		    		<xsl:for-each select="rankingGenreSummary/positionsTable/positionsTableDataRow">

					<tr>
						<td><xsl:value-of select="positionsTableDataGenre"/></td>			    			
						<td>

		    			<xsl:for-each select="positionsTableDataTitles/positionsTableDataTitle">

							<p><xsl:value-of select="current()"/></p>

						</xsl:for-each>

						</td>	
						<td><xsl:value-of select="positionsTableDataSummedRating"/></td>						
					</tr>

					</xsl:for-each>

				</table>
				<h2 id="reportTable">Report</h2>
				<table>
					<tr>
						<th><xsl:value-of select="reportTable/reportTableHeadRow/reportTableHeadNGenres"/></th>
						<th><xsl:value-of select="reportTable/reportTableHeadRow/reportTableHeadNPositions"/></th>
						<th><xsl:value-of select="reportTable/reportTableHeadRow/reportTableHeadTotal"/></th>		
						<th><xsl:value-of select="reportTable/reportTableHeadRow/reportTableHeadDate"/></th>							
					</tr>
					<tr>
						<td><xsl:value-of select="reportTable/reportTableDataRow/reportTableDataNGeneres"/></td>
						<td><xsl:value-of select="reportTable/reportTableDataRow/reportTableDataNPositions"/></td>
						<td><xsl:value-of select="reportTable/reportTableDataRow/reportTableDataTotal"/></td>
						<td><xsl:value-of select="reportTable/reportTableDataRow/reportTableDataDate"/></td>					
					</tr>
				</table>
				<p><a href="#positionsTable">Genres</a></p>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>