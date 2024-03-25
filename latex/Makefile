clean:
	rm -f *.log *.pdf *.fdb_latexmk *.aux *.fls *.gz *.toc

compile:
	pdflatex ./latex/*.tex -output-directory .

move_note:
	mv clase$(LECTURE_NUMBER).pdf ../catedras/clase$(LECTURE_NUMBER)

move_problemset:
	mv guia$(SET_NUMBER).pdf ../guias/guia$(SET_NUMBER)
