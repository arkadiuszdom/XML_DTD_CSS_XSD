<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<rankingGenreSummary>
			<positionsTable>
				<positionsTableRow>
					<positionsTableHead>Genre</positionsTableHead>
					<positionsTableHead>Titles</positionsTableHead>
					<positionsTableHead>Summed rating</positionsTableHead>
				</positionsTableRow>


	    		<xsl:for-each select="ranking/genres/genre">
      			<xsl:sort select="current()"/>
   				<xsl:variable name="currentGenreId" select="@genre_id"/>


				<positionsTableRow>
					<positionsTableData><xsl:value-of select="current()"/></positionsTableData>
					<positionsTableData>


      				<xsl:for-each select="/ranking/positions/position[genreName/@genre_id=$currentGenreId]">
      				<xsl:sort select="name"/>
      				

					<positionsTableData><xsl:value-of select="name"/></positionsTableData>

      				</xsl:for-each>


					</positionsTableData>
					<positionsTableData><xsl:value-of select="sum(/ranking/positions/position[genreName/@genre_id=$currentGenreId]/rating)"/></positionsTableData>
				</positionsTableRow>

	    		</xsl:for-each>

			</positionsTable>

		</rankingGenreSummary>
		<reportTable>
			<reportTableRow>
				<reportTableHead>Number of genres</reportTableHead>
				<reportTableHead>Number of positions</reportTableHead>
				<reportTableHead>Summed ratings total</reportTableHead>
				<reportTableHead>Date</reportTableHead>
			</reportTableRow>
			<reportTableRow>
				<reportTableData><xsl:value-of select="count(ranking/genres/genre)"/></reportTableData>
				<reportTableData><xsl:value-of select="count(ranking/positions/position)"/></reportTableData>
				<reportTableData><xsl:value-of select="sum(ranking/positions/position/rating)"/></reportTableData>
				<reportTableData><xsl:value-of select="current-dateTime()"/></reportTableData>
			</reportTableRow>
		</reportTable>
	</xsl:template>
</xsl:stylesheet>