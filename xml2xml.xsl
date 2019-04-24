<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<rankingGenreSummary>
			<positionsTable>
				<positionsTableHeadRow>
					<positionsTableHeadGenre>Genre</positionsTableHeadGenre>
					<positionsTableHeadTitles>Titles</positionsTableHeadTitles>
					<positionsTableHeadSummedRating>Summed rating</positionsTableHeadSummedRating>
				</positionsTableHeadRow>


	    		<xsl:for-each select="ranking/genres/genre">
      			<xsl:sort select="current()"/>
   				<xsl:variable name="currentGenreId" select="@genre_id"/>


				<positionsTableDataRow>
					<positionsTableDataGenre><xsl:value-of select="current()"/></positionsTableDataGenre>
					<positionsTableDataTitles>


      				<xsl:for-each select="/ranking/positions/position[genreName/@genre_id=$currentGenreId]">
      				<xsl:sort select="name"/>
      				

					<positionsTableDataTitle><xsl:value-of select="name"/></positionsTableDataTitle>

      				</xsl:for-each>


					</positionsTableDataTitles>
					<positionsTableDataSummedRating><xsl:value-of select="sum(/ranking/positions/position[genreName/@genre_id=$currentGenreId]/rating)"/></positionsTableDataSummedRating>
				</positionsTableDataRow>

	    		</xsl:for-each>

			</positionsTable>
			<reportTable>
				<reportTableHeadRow>
					<reportTableHeadNGenres>Number of genres</reportTableHeadNGenres>
					<reportTableHeadNPositions>Number of positions</reportTableHeadNPositions>
					<reportTableHeadTotal>Summed ratings total</reportTableHeadTotal>
					<reportTableHeadDate>Date</reportTableHeadDate>
				</reportTableHeadRow>
				<reportTableDataRow>
					<reportTableDataNGeneres><xsl:value-of select="count(ranking/genres/genre)"/></reportTableDataNGeneres>
					<reportTableDataNPositions><xsl:value-of select="count(ranking/positions/position)"/></reportTableDataNPositions>
					<reportTableDataTotal><xsl:value-of select="sum(ranking/positions/position/rating)"/></reportTableDataTotal>
					<reportTableDataDate><xsl:value-of select="current-dateTime()"/></reportTableDataDate>
				</reportTableDataRow>
			</reportTable>
		</rankingGenreSummary>
	</xsl:template>
</xsl:stylesheet>