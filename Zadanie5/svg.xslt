<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<svg version="1.1" xmlns="http://www.w3.org/2000/svg">
			<xsl:variable name="listheader_y_position" select='50' />
			<xsl:variable name="list_y_position" select='50' />
			<xsl:variable name="games_box_base_width" select='10' />
			<xsl:variable name="box_height" select='20' />
			<xsl:variable name="text_y_position_offset" select='15' />
			<xsl:variable name="interval_height" select='5' />
			<xsl:variable name="interval_x_position" select='20' />
			<xsl:variable name="rating_interval_x_position" select='40' />
			<xsl:variable name="box_x_position" select='100' />
			<xsl:variable name="games_x_width" select='150' />
			<xsl:variable name="y_d_interval" select='20' />


			<text y="{$listheader_y_position}">
				<xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadGenre"/>
			</text>
			<text x="{$box_x_position}" y="{$listheader_y_position}">
				<xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadTitles"/>
			</text>
			<text x="{$games_x_width + $box_x_position + $interval_x_position}" y="{$listheader_y_position}">
				<xsl:value-of select="rankingGenreSummary/positionsTable/positionsTableHeadRow/positionsTableHeadSummedRating"/>
			</text>

			<xsl:for-each select="rankingGenreSummary/positionsTable/positionsTableDataRow">

				<xsl:variable name="games_number" select='count(positionsTableDataTitles/positionsTableDataTitle)' />
				<xsl:variable name="counter" select='position()' />				
				<xsl:variable name="y_position" select='$list_y_position + $counter * ($box_height + $interval_height)' />
				<xsl:variable name="games_box_width" select='$games_number*$games_box_base_width' />
				<xsl:variable name="rating" select='positionsTableDataSummedRating' />
				<xsl:variable name="rating_box_width" select='$rating*$games_box_base_width' />

				<g>
					<text y="{$y_position + $text_y_position_offset}">
						<xsl:value-of select="positionsTableDataGenre"/>:
					</text>

					<rect box_number="{$counter}" class="games_box" width="{$games_box_width}" height="{$box_height}" x="{$box_x_position}" y="{$y_position}">
						<titles titles_number="{$counter}">
							<xsl:for-each select="positionsTableDataTitles/positionsTableDataTitle">
								<text>
									<xsl:value-of select="current()"/>
								</text>
							</xsl:for-each>
						</titles>
					</rect>
					<text y="{$y_position + $text_y_position_offset}" x="{$box_x_position + $games_box_width + $interval_x_position}">
						<xsl:value-of select="$games_number"/> games 
					</text>

					<rect width="{$rating_box_width}" height="{$box_height}" x="{$games_x_width + $box_x_position + $interval_x_position}" y="{$y_position}"></rect>
					<text y="{$y_position + $text_y_position_offset}" x="{$games_x_width + $box_x_position + $rating_interval_x_position + $rating_box_width}">
						<xsl:value-of select="substring($rating, 0, 5)"/> points 
					</text>
				</g>

			</xsl:for-each>
		
			<text x="50" y="250" fill="blue">
			  	<tspan>
					<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadNGenres"/>: <xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataNGeneres"/>
			  	</tspan>
			  	<tspan dy="{$y_d_interval}">
					<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadNPositions"/>: <xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataNPositions"/>
			  	</tspan>
			  	<tspan dy="{$y_d_interval}">
					<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadTotal"/>: <xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataTotal"/>
			  	</tspan>
			  	<tspan dy="{$y_d_interval}">
					<xsl:value-of select="rankingGenreSummary/reportTable/reportTableHeadRow/reportTableHeadDate"/>: <xsl:value-of select="rankingGenreSummary/reportTable/reportTableDataRow/reportTableDataTotal"/>
			  	</tspan>
			   	<animate 
				    attributeName="x"
				    from="50"
				    to="550" 
				    dur="10s"
				    begin="click"
				    fill="freeze" 
			   	/>
		   	</text>

		  	<script type="text/javascript">
		  	<![CDATA[
		  		const game_boxes = document.querySelectorAll(".games_box");
				for(let game_box of game_boxes) {
					game_box.addEventListener("click", function(){
				        const titles=game_box.children[0].children;
						let titles_string="";
				        for(let title of titles) {
				            titles_string+=title.textContent+"\n";
					    }
						alert(titles_string);
				    });
				}
		  	]]>		  	
		  	</script>

		</svg>
	</xsl:template>
</xsl:stylesheet>